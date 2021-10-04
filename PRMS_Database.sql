-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 04, 2021 at 01:20 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(10) UNSIGNED NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin'),
(2, 'pradesh', 'pradesh');

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `id` int(10) UNSIGNED NOT NULL,
  `doctorName` text NOT NULL,
  `patientName` text NOT NULL,
  `fee` int(10) UNSIGNED NOT NULL,
  `appointmentDate` date NOT NULL,
  `time` text NOT NULL,
  `status` text NOT NULL,
  `d_id` int(10) UNSIGNED NOT NULL,
  `p_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`id`, `doctorName`, `patientName`, `fee`, `appointmentDate`, `time`, `status`, `d_id`, `p_id`) VALUES
(2, 'HariLal', 'GitaLama', 2000, '2021-03-19', '9am', 'Off', 3, 2),
(4, 'DhirajJha', 'ShyamRai', 500, '2021-03-05', '4pm', 'On', 7, 1),
(23, 'HariLal', 'SitaDhakal', 555, '2021-10-03', '7am', 'On', 3, 5),
(25, 'HariLal', 'PopatLal', 33333, '2021-10-04', '8am', 'On', 3, 14);

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` text NOT NULL,
  `address` varchar(30) NOT NULL,
  `gender` text NOT NULL,
  `age` tinyint(3) UNSIGNED NOT NULL,
  `contact` bigint(20) UNSIGNED NOT NULL,
  `marital` text NOT NULL,
  `joiningdate` date NOT NULL,
  `doctortype` text NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `adminid` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`id`, `name`, `address`, `gender`, `age`, `contact`, `marital`, `joiningdate`, `doctortype`, `username`, `password`, `adminid`) VALUES
(1, 'RamShah', 'Patan08', 'Male', 55, 9860465034, 'Married', '2021-03-05', 'Cardiologist', 'ram123', 'ram123', 1),
(3, 'HariLal', 'Ktm11', 'Male', 55, 9852036254, 'Unmarried', '2021-03-01', 'General Physician', 'hari123', 'hari321', 1),
(4, 'ShyamLal', 'Pokhara15', 'Male', 44, 9863021455, 'Married', '2021-03-04', 'Gynecologist', 'shyam555', 'shyam555', 1),
(5, 'SitaLama', 'Kavre02', 'Female', 35, 9860325414, 'Unmarried', '2021-03-07', 'Surgeon', 'sita123', 'sita321', 1),
(6, 'GitaRai', 'Banepa15', 'Female', 40, 9808563244, 'Unmarried', '2021-03-12', 'Nephrologist', 'gita777', 'gita777', 1),
(7, 'Dhirajha', 'Rajbiraj05', 'Male', 38, 9863333333, 'Married', '2021-10-03', 'Neurologist', 'dhiraj123', 'dhiraj123', 1),
(8, 'RajishShrestha', 'Kathandu', 'Male', 22, 9843625122, 'Unmarried', '2021-09-05', 'Cardiologist', 'rajish111', 'rajish111', 2),
(15, 'sad', 'sdd44', 'Male', 44, 9856985556, 'Married', '2021-10-03', 'Neurologist', 'ppp', 'sss', 1);

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` text NOT NULL,
  `address` varchar(30) NOT NULL,
  `gender` text NOT NULL,
  `age` tinyint(3) UNSIGNED NOT NULL,
  `contact` bigint(20) UNSIGNED NOT NULL,
  `marital` text NOT NULL,
  `registerdate` date NOT NULL,
  `adminid` int(10) UNSIGNED DEFAULT NULL,
  `recepid` int(10) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`id`, `name`, `address`, `gender`, `age`, `contact`, `marital`, `registerdate`, `adminid`, `recepid`) VALUES
(1, 'ShyamRai', 'Kavre05', 'Male', 35, 9852632514, 'Married', '2021-03-04', 1, NULL),
(2, 'GitaLama', 'Jhapa07', 'Female', 44, 9825363214, 'Married', '2021-03-02', 1, NULL),
(4, 'ShvaramThapa', 'Patan11', 'Male', 22, 9852524125, 'Unmarried', '2021-03-02', 1, NULL),
(5, 'SitaDhakal', 'Bhaktapur06', 'Male', 33, 9852145233, 'Married', '2021-09-22', 1, NULL),
(6, 'ShivRam', 'Kathmandu02', 'Male', 22, 9841514939, 'Unmarried', '2021-09-23', 2, NULL),
(9, 'saritagc', 'koteshow06', 'Female', 22, 9867412555, 'Unmarried', '2021-10-01', 1, NULL),
(10, 'AlexMorgan', 'Jhapa06', 'Male', 66, 9863333333, 'Married', '2021-10-01', 1, NULL),
(11, 'AnilRam', 'Pokhara02', 'Male', 34, 9863636585, 'Married', '2021-10-04', 1, NULL),
(14, 'PopatLal', 'Illam03', 'Male', 44, 9863524788, 'Unmarried', '2021-10-04', 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `prescription`
--

CREATE TABLE `prescription` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` text NOT NULL,
  `contact` bigint(20) UNSIGNED NOT NULL,
  `gender` text NOT NULL,
  `age` tinyint(3) UNSIGNED NOT NULL,
  `disease` varchar(200) NOT NULL,
  `prescription` varchar(500) NOT NULL,
  `pres_Date` date NOT NULL,
  `d_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prescription`
--

INSERT INTO `prescription` (`id`, `name`, `contact`, `gender`, `age`, `disease`, `prescription`, `pres_Date`, `d_id`) VALUES
(4, 'GitaLama', 9825363214, 'Female', 44, 'High Fever', 'Paracetamol 30 mg per dose 3 times\nLiquid  1 cap per day', '2021-10-02', 3),
(9, 'PopatLal', 9863524788, 'Male', 44, 'HighFever', 'Paraacetamol 30mg per day', '2021-10-04', 3);

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` text NOT NULL,
  `address` varchar(30) NOT NULL,
  `gender` text NOT NULL,
  `age` tinyint(5) UNSIGNED NOT NULL,
  `contact` bigint(20) UNSIGNED NOT NULL,
  `marital` text NOT NULL,
  `joiningdate` date NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `adminid` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`id`, `name`, `address`, `gender`, `age`, `contact`, `marital`, `joiningdate`, `username`, `password`, `adminid`) VALUES
(1, 'ShivaniDhakal', 'Bhaktapur01', 'Female', 23, 9808545393, 'Unmarried', '2021-03-01', 'shivani123', 'shivani123', 1),
(2, 'NeridTamrakar', 'Patan02', 'Female', 21, 9843252625, 'Unmarried', '2021-03-02', 'nerid123', 'nerid321', 1),
(3, 'SuprabhaPathak', 'Baglung11', 'Female', 22, 9852223652, 'Unmarried', '2021-03-03', 'sup123', 'sup321', 1),
(4, 'Shreejana', 'Bkt05', 'Male', 29, 9863366663, 'Unmarried', '2021-10-03', 'shreejana111', 'shree111', 1),
(6, 'SaritaGC', 'Jhapa05', 'Female', 23, 9860253336, 'Unmarried', '2021-10-04', 'sarita123', 'sarita123', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`id`),
  ADD KEY `d_id` (`d_id`),
  ADD KEY `p_id` (`p_id`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `adminid` (`adminid`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`id`),
  ADD KEY `adminid` (`adminid`),
  ADD KEY `recepid` (`recepid`);

--
-- Indexes for table `prescription`
--
ALTER TABLE `prescription`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`id`),
  ADD KEY `adminid` (`adminid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `prescription`
--
ALTER TABLE `prescription`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `receptionist`
--
ALTER TABLE `receptionist`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `appointment`
--
ALTER TABLE `appointment`
  ADD CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`d_id`) REFERENCES `doctor` (`id`),
  ADD CONSTRAINT `appointment_ibfk_2` FOREIGN KEY (`p_id`) REFERENCES `patient` (`id`);

--
-- Constraints for table `doctor`
--
ALTER TABLE `doctor`
  ADD CONSTRAINT `doctor_ibfk_1` FOREIGN KEY (`adminid`) REFERENCES `admin` (`id`);

--
-- Constraints for table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`adminid`) REFERENCES `admin` (`id`),
  ADD CONSTRAINT `patient_ibfk_2` FOREIGN KEY (`recepid`) REFERENCES `receptionist` (`id`);

--
-- Constraints for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD CONSTRAINT `receptionist_ibfk_1` FOREIGN KEY (`adminid`) REFERENCES `admin` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
