-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2024 at 03:47 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_warehouse`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kode_barang` char(8) NOT NULL,
  `kode_jenis` char(5) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `satuan` varchar(10) NOT NULL,
  `harga` int(11) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kode_barang`, `kode_jenis`, `nama_barang`, `satuan`, `harga`, `stok`) VALUES
('B001', 'JB001', 'Televisi', 'Unit', 0, 10),
('B002', 'JB002', 'Kaos', 'Pcs', 0, 50),
('B003', 'JB003', 'Roti', 'Pack', 0, 30),
('B004', 'JB004', 'Minuman Soda', 'Botol', 0, 40),
('B005', 'JB005', 'Obeng', 'Unit', 0, 15),
('B006', 'JB006', 'Paracetamol', 'Strip', 0, 20),
('B007', 'JB007', 'Lipstik', 'Pcs', 0, 25),
('B008', 'JB008', 'Buku Tulis', 'Pcs', 0, 35),
('B009', 'JB009', 'Pensil', 'Box', 0, 45),
('B010', 'JB010', 'Boneka', 'Unit', 0, 10);

-- --------------------------------------------------------

--
-- Table structure for table `barang_keluar`
--

CREATE TABLE `barang_keluar` (
  `no_keluar` char(12) NOT NULL,
  `tgl_keluar` date NOT NULL,
  `total_keluar` double NOT NULL,
  `id_pengguna` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang_keluar`
--

INSERT INTO `barang_keluar` (`no_keluar`, `tgl_keluar`, `total_keluar`, `id_pengguna`) VALUES
('BK001', '2024-01-21', 100000, 'USR2406001'),
('BK002', '2024-01-22', 200000, 'USR2406002'),
('BK003', '2024-01-23', 300000, 'USR2406003'),
('BK004', '2024-01-24', 400000, 'USR2406004'),
('BK005', '2024-01-25', 500000, 'USR2406005'),
('BK006', '2024-01-26', 600000, 'USR2406006'),
('BK007', '2024-01-27', 700000, 'USR2406007'),
('BK008', '2024-01-28', 800000, 'USR2406008'),
('BK009', '2024-01-29', 900000, 'USR2406009'),
('BK010', '2024-01-30', 1000000, 'USR2406010');

-- --------------------------------------------------------

--
-- Table structure for table `barang_masuk`
--

CREATE TABLE `barang_masuk` (
  `no_masuk` char(12) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `total_masuk` double NOT NULL,
  `id_distributor` char(10) NOT NULL,
  `id_pengguna` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang_masuk`
--

INSERT INTO `barang_masuk` (`no_masuk`, `tgl_masuk`, `total_masuk`, `id_distributor`, `id_pengguna`) VALUES
('BM001', '2024-01-11', 100000, 'D001', 'USR2406001'),
('BM002', '2024-01-12', 200000, 'D002', 'USR2406002'),
('BM003', '2024-01-13', 300000, 'D003', 'USR2406003'),
('BM004', '2024-01-14', 400000, 'D004', 'USR2406004'),
('BM005', '2024-01-15', 500000, 'D005', 'USR2406005'),
('BM006', '2024-01-16', 600000, 'D006', 'USR2406006'),
('BM007', '2024-01-17', 700000, 'D007', 'USR2406007'),
('BM008', '2024-01-18', 800000, 'D008', 'USR2406008'),
('BM009', '2024-01-19', 900000, 'D009', 'USR2406009'),
('BM010', '2024-01-20', 1000000, 'D010', 'USR2406010');

-- --------------------------------------------------------

--
-- Table structure for table `barang_zona`
--

CREATE TABLE `barang_zona` (
  `kode_barang` char(8) NOT NULL,
  `id_zona` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang_zona`
--

INSERT INTO `barang_zona` (`kode_barang`, `id_zona`) VALUES
('B001', 'Z001'),
('B002', 'Z002'),
('B003', 'Z003'),
('B004', 'Z004'),
('B005', 'Z005'),
('B006', 'Z006'),
('B007', 'Z007'),
('B008', 'Z008'),
('B009', 'Z009'),
('B010', 'Z010');

-- --------------------------------------------------------

--
-- Table structure for table `detail_barang_keluar`
--

CREATE TABLE `detail_barang_keluar` (
  `no_keluar` char(12) NOT NULL,
  `kode_barang` char(8) NOT NULL,
  `jml_keluar` int(11) NOT NULL,
  `subtotal_keluar` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `detail_barang_keluar`
--

INSERT INTO `detail_barang_keluar` (`no_keluar`, `kode_barang`, `jml_keluar`, `subtotal_keluar`) VALUES
('BK001', 'B001', 5, 50000),
('BK002', 'B002', 10, 100000),
('BK003', 'B003', 15, 150000),
('BK004', 'B004', 20, 200000),
('BK005', 'B005', 25, 250000),
('BK006', 'B006', 30, 300000),
('BK007', 'B007', 35, 350000),
('BK008', 'B008', 40, 400000),
('BK009', 'B009', 45, 450000),
('BK010', 'B010', 50, 500000);

-- --------------------------------------------------------

--
-- Table structure for table `detail_barang_masuk`
--

CREATE TABLE `detail_barang_masuk` (
  `no_masuk` char(12) NOT NULL,
  `kode_barang` char(8) NOT NULL,
  `jml_masuk` int(11) NOT NULL,
  `subtotal_masuk` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `detail_barang_masuk`
--

INSERT INTO `detail_barang_masuk` (`no_masuk`, `kode_barang`, `jml_masuk`, `subtotal_masuk`) VALUES
('BM001', 'B001', 10, 100000),
('BM002', 'B002', 20, 200000),
('BM003', 'B003', 30, 300000),
('BM004', 'B004', 40, 400000),
('BM005', 'B005', 50, 500000),
('BM006', 'B006', 60, 600000),
('BM007', 'B007', 70, 700000),
('BM008', 'B008', 80, 800000),
('BM009', 'B009', 90, 900000),
('BM010', 'B010', 100, 1000000);

-- --------------------------------------------------------

--
-- Table structure for table `detail_pemesanan`
--

CREATE TABLE `detail_pemesanan` (
  `no_pesan` char(12) NOT NULL,
  `kode_barang` char(8) NOT NULL,
  `jml_pesan` int(11) NOT NULL,
  `subtotal_pesan` double NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `detail_pemesanan`
--

INSERT INTO `detail_pemesanan` (`no_pesan`, `kode_barang`, `jml_pesan`, `subtotal_pesan`, `status`) VALUES
('PO001', 'B001', 10, 100000, 'Pending'),
('PO002', 'B002', 20, 200000, 'Pending'),
('PO003', 'B003', 30, 300000, 'Pending'),
('PO004', 'B004', 40, 400000, 'Pending'),
('PO005', 'B005', 50, 500000, 'Pending'),
('PO006', 'B006', 60, 600000, 'Pending'),
('PO007', 'B007', 70, 700000, 'Pending'),
('PO008', 'B008', 80, 800000, 'Pending'),
('PO009', 'B009', 90, 900000, 'Pending'),
('PO010', 'B010', 100, 1000000, 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `gudang`
--

CREATE TABLE `gudang` (
  `id_gudang` char(10) NOT NULL,
  `nama_gudang` varchar(50) NOT NULL,
  `lokasi_gudang` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `gudang`
--

INSERT INTO `gudang` (`id_gudang`, `nama_gudang`, `lokasi_gudang`) VALUES
('G001', 'Gudang Utama', 'Jl. Raya No. 1'),
('G002', 'Gudang Kedua', 'Jl. Raya No. 2'),
('G003', 'Gudang Ketiga', 'Jl. Raya No. 3'),
('G004', 'Gudang Keempat', 'Jl. Raya No. 4'),
('G005', 'Gudang Kelima', 'Jl. Raya No. 5'),
('G006', 'Gudang Keenam', 'Jl. Raya No. 6'),
('G007', 'Gudang Ketujuh', 'Jl. Raya No. 7'),
('G008', 'Gudang Kedelapan', 'Jl. Raya No. 8'),
('G009', 'Gudang Kesembilan', 'Jl. Raya No. 9'),
('G010', 'Gudang Kesepuluh', 'Jl. Raya No. 10');

-- --------------------------------------------------------

--
-- Table structure for table `jenis_barang`
--

CREATE TABLE `jenis_barang` (
  `kode_jenis` char(6) NOT NULL,
  `nama_jenis` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jenis_barang`
--

INSERT INTO `jenis_barang` (`kode_jenis`, `nama_jenis`) VALUES
('JB001', 'Elektronik'),
('JB002', 'Pakaian'),
('JB003', 'Makanan'),
('JB004', 'Minuman'),
('JB005', 'Peralatan'),
('JB006', 'Obat-obatan'),
('JB007', 'Kosmetik'),
('JB008', 'Buku'),
('JB009', 'Alat Tulis'),
('JB010', 'Mainan');

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan`
--

CREATE TABLE `pemesanan` (
  `no_pesan` char(12) NOT NULL,
  `tgl_pesan` date NOT NULL,
  `total_pesan` double NOT NULL,
  `id_distributor` char(10) NOT NULL,
  `id_pengguna` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pemesanan`
--

INSERT INTO `pemesanan` (`no_pesan`, `tgl_pesan`, `total_pesan`, `id_distributor`, `id_pengguna`) VALUES
('PO001', '2024-01-01', 1000000, 'D001', 'USR2406001'),
('PO002', '2024-01-02', 2000000, 'D002', 'USR2406002'),
('PO003', '2024-01-03', 3000000, 'D003', 'USR2406003'),
('PO004', '2024-01-04', 4000000, 'D004', 'USR2406004'),
('PO005', '2024-01-05', 5000000, 'D005', 'USR2406005'),
('PO006', '2024-01-06', 6000000, 'D006', 'USR2406006'),
('PO007', '2024-01-07', 7000000, 'D007', 'USR2406007'),
('PO008', '2024-01-08', 8000000, 'D008', 'USR2406008'),
('PO009', '2024-01-09', 9000000, 'D009', 'USR2406009'),
('PO010', '2024-01-10', 10000000, 'D010', 'USR2406010');

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `id_pengguna` char(10) NOT NULL,
  `nama_pengguna` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(100) NOT NULL,
  `level` enum('Owner','Staff') NOT NULL,
  `telp_pengguna` varchar(13) NOT NULL,
  `alamat_pengguna` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`id_pengguna`, `nama_pengguna`, `username`, `password`, `level`, `telp_pengguna`, `alamat_pengguna`) VALUES
('USR2406001', 'anugerah', 'anugerah', 'aefcb0b9d1af9dac0d475e4cdfe043ff', 'Staff', '082166779999', 'Surabaya, Jawa Timur'),
('USR2406002', 'putra', 'putra', '5e0c5a0bf82decdd43b2150b622c66c5', 'Staff', '083477882222', 'Sidoarjo, Jawa Timur'),
('USR2406003', 'admin', 'admin', '21232f297a57a5a743894a0e4a801fc3', 'Owner', '081299008844', 'Gresik, Jawa Timur'),
('USR2406004', 'Anton', 'anton', '784742a66a3a0c271feced5b149ff8db', 'Staff', '087733221567', 'Jl kangkung 28 gang garuda, Surabaya, Jawa Timur'),
('USR2406005', 'Karyawan5', 'karyawan5', 'd5cff9e63bdf56ba61a86f19a626291b', 'Staff', '089988889999', 'Jl Garuda 58'),
('USR2406006', 'Karyawan6', 'karyawan6', '065f6ca8061edb7fdfa9e8e0043b65e6', 'Staff', '081277995566', 'Jl Makam 58'),
('USR2406007', 'Karyawan7', 'karyawan7', '7217e9dfb7090b42105be6bf9c8a4b96', 'Staff', '083877224412', 'Jl Merpati 12'),
('USR2406008', 'Mas dev', 'devano', '7ef899e97f7eb6e238205da666a66afe', 'Staff', '083144558822', 'JL Gagak 57'),
('USR2406009', 'Mister Smith', 'smith', 'a66e44736e753d4533746ced572ca821', 'Owner', '081122228888', 'Citra Land B-43'),
('USR2406010', 'Josh', 'josh', 'f94adcc3ddda04a8f34928d862f404b4', 'Staff', '081355889032', 'Jl Kadal 25'),
('USR2406011', 'heru', 'heru', '2cb896e1ea36e8dde39cf4574fe6d786', 'Staff', '081477993300', 'Jl Pochinok No 90');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` char(10) NOT NULL,
  `nama_supplier` varchar(30) NOT NULL,
  `telp_supplier` varchar(13) NOT NULL,
  `alamat_supplier` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama_supplier`, `telp_supplier`, `alamat_supplier`) VALUES
('D001', 'Distributor A', '081234567890', 'Jl. Merpati No. 1'),
('D002', 'Distributor B', '081234567891', 'Jl. Rajawali No. 2'),
('D003', 'Distributor C', '081234567892', 'Jl. Elang No. 3'),
('D004', 'Distributor D', '081234567893', 'Jl. Garuda No. 4'),
('D005', 'Distributor E', '081234567894', 'Jl. Kenari No. 5'),
('D006', 'Distributor F', '081234567895', 'Jl. Kutilang No. 6'),
('D007', 'Distributor G', '081234567896', 'Jl. Jati No. 7'),
('D008', 'Distributor H', '081234567897', 'Jl. Cemara No. 8'),
('D009', 'Distributor I', '081234567898', 'Jl. Melati No. 9'),
('D010', 'Distributor J', '081234567899', 'Jl. Anggrek No. 10'),
('DST2406001', '4444', '1234', 'apalah');

-- --------------------------------------------------------

--
-- Table structure for table `zona`
--

CREATE TABLE `zona` (
  `id_zona` char(10) NOT NULL,
  `id_gudang` char(10) NOT NULL,
  `nama_zona` varchar(50) NOT NULL,
  `temperatur` varchar(10) NOT NULL,
  `tingkat_keamanan` enum('Rendah','Sedang','Tinggi') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `zona`
--

INSERT INTO `zona` (`id_zona`, `id_gudang`, `nama_zona`, `temperatur`, `tingkat_keamanan`) VALUES
('Z001', 'G002', 'Zona Batuk', '20', 'Tinggi'),
('Z002', 'G002', 'Zona Pakaian', '', 'Sedang'),
('Z003', 'G003', 'Zona Makanan', '15C', 'Tinggi'),
('Z004', 'G004', 'Zona Minuman', '5C', 'Sedang'),
('Z005', 'G005', 'Zona Peralatan', '', 'Sedang'),
('Z006', 'G006', 'Zona Obat', '18C', 'Tinggi'),
('Z007', 'G007', 'Zona Kosmetik', '22C', 'Sedang'),
('Z008', 'G008', 'Zona Buku', '', 'Rendah'),
('Z009', 'G009', 'Zona Alat Tulis', '', 'Rendah'),
('Z010', 'G010', 'Zona Mainan', '', 'Rendah'),
('Z011', 'G007', 'zone', '25', 'Tinggi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode_barang`),
  ADD KEY `kode_jenis` (`kode_jenis`);

--
-- Indexes for table `barang_keluar`
--
ALTER TABLE `barang_keluar`
  ADD PRIMARY KEY (`no_keluar`),
  ADD KEY `fk_barang_keluar_pengguna` (`id_pengguna`);

--
-- Indexes for table `barang_masuk`
--
ALTER TABLE `barang_masuk`
  ADD PRIMARY KEY (`no_masuk`),
  ADD KEY `id_distributor` (`id_distributor`),
  ADD KEY `id_pengguna` (`id_pengguna`);

--
-- Indexes for table `barang_zona`
--
ALTER TABLE `barang_zona`
  ADD PRIMARY KEY (`kode_barang`,`id_zona`),
  ADD KEY `id_zona` (`id_zona`);

--
-- Indexes for table `detail_barang_keluar`
--
ALTER TABLE `detail_barang_keluar`
  ADD KEY `no_keluar` (`no_keluar`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `detail_barang_masuk`
--
ALTER TABLE `detail_barang_masuk`
  ADD KEY `no_masuk` (`no_masuk`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `detail_pemesanan`
--
ALTER TABLE `detail_pemesanan`
  ADD KEY `no_pesan` (`no_pesan`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `gudang`
--
ALTER TABLE `gudang`
  ADD PRIMARY KEY (`id_gudang`);

--
-- Indexes for table `jenis_barang`
--
ALTER TABLE `jenis_barang`
  ADD PRIMARY KEY (`kode_jenis`);

--
-- Indexes for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`no_pesan`),
  ADD KEY `id_pengguna` (`id_pengguna`),
  ADD KEY `id_distributor` (`id_distributor`);

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`id_pengguna`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Indexes for table `zona`
--
ALTER TABLE `zona`
  ADD PRIMARY KEY (`id_zona`),
  ADD KEY `id_gudang` (`id_gudang`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`kode_jenis`) REFERENCES `jenis_barang` (`kode_jenis`);

--
-- Constraints for table `barang_keluar`
--
ALTER TABLE `barang_keluar`
  ADD CONSTRAINT `fk_barang_keluar_pengguna` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`);

--
-- Constraints for table `barang_masuk`
--
ALTER TABLE `barang_masuk`
  ADD CONSTRAINT `barang_masuk_ibfk_1` FOREIGN KEY (`id_distributor`) REFERENCES `supplier` (`id_supplier`),
  ADD CONSTRAINT `barang_masuk_ibfk_2` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`);

--
-- Constraints for table `barang_zona`
--
ALTER TABLE `barang_zona`
  ADD CONSTRAINT `barang_zona_ibfk_1` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`),
  ADD CONSTRAINT `barang_zona_ibfk_2` FOREIGN KEY (`id_zona`) REFERENCES `zona` (`id_zona`);

--
-- Constraints for table `detail_barang_keluar`
--
ALTER TABLE `detail_barang_keluar`
  ADD CONSTRAINT `detail_barang_keluar_ibfk_1` FOREIGN KEY (`no_keluar`) REFERENCES `barang_keluar` (`no_keluar`),
  ADD CONSTRAINT `detail_barang_keluar_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`);

--
-- Constraints for table `detail_barang_masuk`
--
ALTER TABLE `detail_barang_masuk`
  ADD CONSTRAINT `detail_barang_masuk_ibfk_1` FOREIGN KEY (`no_masuk`) REFERENCES `barang_masuk` (`no_masuk`),
  ADD CONSTRAINT `detail_barang_masuk_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`);

--
-- Constraints for table `detail_pemesanan`
--
ALTER TABLE `detail_pemesanan`
  ADD CONSTRAINT `detail_pemesanan_ibfk_1` FOREIGN KEY (`no_pesan`) REFERENCES `pemesanan` (`no_pesan`),
  ADD CONSTRAINT `detail_pemesanan_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`);

--
-- Constraints for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD CONSTRAINT `pemesanan_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`),
  ADD CONSTRAINT `pemesanan_ibfk_2` FOREIGN KEY (`id_distributor`) REFERENCES `supplier` (`id_supplier`);

--
-- Constraints for table `zona`
--
ALTER TABLE `zona`
  ADD CONSTRAINT `zona_ibfk_1` FOREIGN KEY (`id_gudang`) REFERENCES `gudang` (`id_gudang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
