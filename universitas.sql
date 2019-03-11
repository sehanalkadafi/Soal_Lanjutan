-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 11, 2019 at 02:18 AM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `universitas`
--

-- --------------------------------------------------------

--
-- Table structure for table `absensi`
--

CREATE TABLE `absensi` (
  `npm` varchar(20) NOT NULL,
  `kd_matakuliah` varchar(50) NOT NULL,
  `kelas` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `npm` varchar(20) NOT NULL,
  `nama_mhs` varchar(100) NOT NULL,
  `kd_jurusan` varchar(20) NOT NULL,
  `alamat` varchar(250) NOT NULL,
  `tlp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`npm`, `nama_mhs`, `kd_jurusan`, `alamat`, `tlp`) VALUES
('201443500424', 'sehan alkadafi', 'KA-121', 'jakarta', '09589554746');

-- --------------------------------------------------------

--
-- Table structure for table `master_fakultas`
--

CREATE TABLE `master_fakultas` (
  `kd_fakultas` varchar(50) NOT NULL,
  `nama_fakultas` varchar(100) NOT NULL,
  `jumlah_fakultas` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_fakultas`
--

INSERT INTO `master_fakultas` (`kd_fakultas`, `nama_fakultas`, `jumlah_fakultas`) VALUES
('02223', 'FTMIPA', '2');

-- --------------------------------------------------------

--
-- Table structure for table `master_jurusan`
--

CREATE TABLE `master_jurusan` (
  `kd_jurusan` varchar(50) NOT NULL,
  `nama_jurusan` varchar(100) NOT NULL,
  `kaprodi` varchar(100) NOT NULL,
  `kd_fakultas` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_jurusan`
--

INSERT INTO `master_jurusan` (`kd_jurusan`, `nama_jurusan`, `kaprodi`, `kd_fakultas`) VALUES
('KA-121', 'informatika', 'mei', '1212');

-- --------------------------------------------------------

--
-- Table structure for table `master_matakuliah`
--

CREATE TABLE `master_matakuliah` (
  `kd_mk` varchar(50) NOT NULL,
  `nama_mk` varchar(100) NOT NULL,
  `sks` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_matakuliah`
--

INSERT INTO `master_matakuliah` (`kd_mk`, `nama_mk`, `sks`) VALUES
('0311', 'Pemrograman', '3');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `master_fakultas`
--
ALTER TABLE `master_fakultas`
  ADD PRIMARY KEY (`kd_fakultas`);

--
-- Indexes for table `master_jurusan`
--
ALTER TABLE `master_jurusan`
  ADD PRIMARY KEY (`kd_jurusan`);

--
-- Indexes for table `master_matakuliah`
--
ALTER TABLE `master_matakuliah`
  ADD PRIMARY KEY (`kd_mk`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
