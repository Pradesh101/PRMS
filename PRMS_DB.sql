-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 22, 2021 at 04:52 PM
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
  `appointmentDate` date NOT NULL,
  `time` text NOT NULL,
  `status` text NOT NULL,
  `d_id` int(10) UNSIGNED NOT NULL,
  `p_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`id`, `doctorName`, `patientName`, `appointmentDate`, `time`, `status`, `d_id`, `p_id`) VALUES
(1, 'Ram Shah', 'Shyam Rai', '2021-03-07', '9 am', 'On', 1, 1),
(2, 'Hari Lal', 'Gita Lama', '2021-03-19', '9 am', 'On', 3, 2),
(4, 'Dhiraj Jha', 'Shyam Rai', '2021-03-05', '4 pm', 'On', 7, 1),
(5, 'Rajish Shrestha', 'Shvaram Thapa', '2021-09-20', '1 pm', 'On', 8, 4);

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
(1, 'Ram Shah', 'Patan-08', 'Male', 55, 9841523625, 'Married', '2021-03-05', 'Cardiologist', 'ram123', 'ram123', 1),
(3, 'Hari Lal', 'Ktm-11', 'Male', 55, 9852036254, 'Unmarried', '2021-03-01', 'General Physician', 'hari123', 'hari321', 1),
(4, 'Shyam Lal', 'Pokhara-15', 'Male', 44, 9863021455, 'Married', '2021-03-04', 'Gynecologist', 'shyam555', 'shyam555', 1),
(5, 'Sita Lama', 'Kavre-02', 'Female', 34, 9860325414, 'Unmarried', '2021-03-07', 'Surgeon', 'sita123', 'sita321', 1),
(6, 'Gita Rai', 'Banepa-15', 'Female', 40, 9808563244, 'Unmarried', '2021-03-12', 'Nephrologist', 'gita777', 'gita777', 1),
(7, 'Dhiraj Jha', 'Rajbiraj-05', 'Male', 38, 9860253625, 'Unmarried', '2021-03-03', 'Neurologist', 'dhiraj123', 'dhiraj321', 1),
(8, 'Rajish Shrestha', 'Kathandu', 'Male', 22, 9843625122, 'Unmarried', '2021-09-05', 'Cardiologist', 'rajish111', 'rajish111', 2);

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
  `disease` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`id`, `name`, `address`, `gender`, `age`, `contact`, `marital`, `registerdate`, `disease`) VALUES
(1, 'Shyam Rai', 'Kavre-05', 'Male', 35, 9852632514, 'Married', '2021-03-04', 'Headache'),
(2, 'Gita Lama', 'Jhapa-07', 'Female', 44, 9825363214, 'Married', '2021-03-02', 'Cancer'),
(4, 'Shvaram Thapa', 'Patan-11', 'Male', 22, 9852524125, 'Unmarried', '2021-03-02', 'Jaundice');

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
  `doctor_Fee` varchar(100) NOT NULL,
  `pres_Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` text NOT NULL,
  `address` varchar(30) NOT NULL,
  `gender` text NOT NULL,
  `age` tinyint(3) UNSIGNED NOT NULL,
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
(1, 'Shivani Dhakal', 'Bhaktapur-01', 'Female', 22, 9845214363, 'Unmarried', '2021-03-01', 'shivani123', 'shivani123', 1),
(2, 'Nerid Tamrakar', 'Patan-02', 'Female', 21, 9843252625, 'Unmarried', '2021-03-02', 'nerid123', 'nerid321', 1),
(3, 'Suprabha Pathak', 'Baglung-11', 'Female', 22, 9852223652, 'Unmarried', '2021-03-03', 'sup123', 'sup321', 1);

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
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `prescription`
--
ALTER TABLE `prescription`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`id`);

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
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `prescription`
--
ALTER TABLE `prescription`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `receptionist`
--
ALTER TABLE `receptionist`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
