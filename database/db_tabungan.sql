-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3325
-- Generation Time: Jun 14, 2023 at 03:31 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_tabungan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_login`
--

CREATE TABLE `tbl_login` (
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_login`
--

INSERT INTO `tbl_login` (`username`, `password`) VALUES
('person1', 'person1');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_statistik`
--

CREATE TABLE `tbl_statistik` (
  `id_statistik` int(11) NOT NULL,
  `pemasukan` int(11) NOT NULL,
  `pengeluaran` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_statistik`
--

INSERT INTO `tbl_statistik` (`id_statistik`, `pemasukan`, `pengeluaran`) VALUES
(3, 27000, 5000);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_tabungan`
--

CREATE TABLE `tbl_tabungan` (
  `id_kas` int(11) NOT NULL,
  `nis` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `kelas` varchar(10) NOT NULL,
  `u_bayar` int(11) NOT NULL,
  `kembalian` int(11) NOT NULL,
  `tgl` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_tabungan`
--

INSERT INTO `tbl_tabungan` (`id_kas`, `nis`, `nama`, `kelas`, `u_bayar`, `kembalian`, `tgl`) VALUES
(27, 18804, 'Adinda', 'KELAS 5', 10000, 5000, '14-06-2023'),
(28, 19806, 'Ahmad', 'KELAS 4', 7000, 2000, '14-06-2023'),
(29, 19807, 'Azura', 'KELAS 4', 5000, 0, '14-06-2023'),
(30, 19903, 'Zaki', 'KELAS 3', 5000, 0, '14-06-2023');

--
-- Triggers `tbl_tabungan`
--
DELIMITER $$
CREATE TRIGGER `pemasukan_trigger` AFTER INSERT ON `tbl_tabungan` FOR EACH ROW UPDATE tbl_statistik SET pemasukan = pemasukan + NEW.u_bayar
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_tabungan_keluar`
--

CREATE TABLE `tbl_tabungan_keluar` (
  `id_transaksi` int(11) NOT NULL,
  `tanggal` varchar(50) NOT NULL,
  `keterangan` text NOT NULL,
  `jumlah` int(11) NOT NULL,
  `bukti_pembayaran` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_tabungan_keluar`
--

INSERT INTO `tbl_tabungan_keluar` (`id_transaksi`, `tanggal`, `keterangan`, `jumlah`, `bukti_pembayaran`) VALUES
(5, '14-06-2023', 'Dinda-Membeli Pensil', 3000, 'xxx'),
(6, '14-06-2023', 'Ahmad-Membeli Penghapus', 2000, 'xxx');

--
-- Triggers `tbl_tabungan_keluar`
--
DELIMITER $$
CREATE TRIGGER `pengeluaran_upd_insert_tbl_tabungan_keluar` AFTER INSERT ON `tbl_tabungan_keluar` FOR EACH ROW UPDATE tbl_statistik SET tbl_statistik.pengeluaran = tbl_statistik.pengeluaran + NEW.jumlah
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_siswa`
--

CREATE TABLE `tb_siswa` (
  `nis` int(11) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `gender` varchar(1) NOT NULL,
  `kelas` varchar(10) NOT NULL,
  `ket` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_siswa`
--

INSERT INTO `tb_siswa` (`nis`, `nama`, `gender`, `kelas`, `ket`) VALUES
(18804, 'Adinda', 'W', 'KELAS 5', 'sudah'),
(19806, 'Ahmad', 'P', 'KELAS 4', 'sudah'),
(19807, 'Azura', 'W', 'KELAS 4', 'sudah'),
(19903, 'Zaki', 'P', 'KELAS 3', 'sudah');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_login`
--
ALTER TABLE `tbl_login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `tbl_statistik`
--
ALTER TABLE `tbl_statistik`
  ADD PRIMARY KEY (`id_statistik`);

--
-- Indexes for table `tbl_tabungan`
--
ALTER TABLE `tbl_tabungan`
  ADD PRIMARY KEY (`id_kas`);

--
-- Indexes for table `tbl_tabungan_keluar`
--
ALTER TABLE `tbl_tabungan_keluar`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- Indexes for table `tb_siswa`
--
ALTER TABLE `tb_siswa`
  ADD PRIMARY KEY (`nis`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_statistik`
--
ALTER TABLE `tbl_statistik`
  MODIFY `id_statistik` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbl_tabungan`
--
ALTER TABLE `tbl_tabungan`
  MODIFY `id_kas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `tbl_tabungan_keluar`
--
ALTER TABLE `tbl_tabungan_keluar`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
