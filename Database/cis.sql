-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 01, 2024 at 05:52 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cis`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `email` varchar(100) NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `id` int(11) NOT NULL,
  `DCode` varchar(100) NOT NULL,
  `name` varchar(1000) NOT NULL,
  `Description` varchar(100) DEFAULT NULL,
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`id`, `DCode`, `name`, `Description`, `timestamp`) VALUES
(4, 'D-816', 'IT', 'Test', '2024-02-28 08:58:50'),
(6, 'D-869', 'Marketing ', 'Test', '2024-03-01 16:20:47'),
(7, 'D-445', 'Sales', 'Test2', '2024-03-01 16:21:05');

-- --------------------------------------------------------

--
-- Table structure for table `designation`
--

CREATE TABLE `designation` (
  `id` int(11) NOT NULL,
  `name` varchar(1000) NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `designation`
--

INSERT INTO `designation` (`id`, `name`, `timestamp`) VALUES
(3, 'HR', '2024-02-29 23:20:42'),
(4, 'Lecture', '2024-03-01 16:21:48');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `epf_num` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `department` varchar(100) DEFAULT NULL,
  `designation` varchar(100) NOT NULL,
  `bod` date DEFAULT NULL,
  `phoneNumber` varchar(15) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL,
  `employmentStatus` varchar(50) DEFAULT NULL,
  `qualifications` varchar(255) DEFAULT NULL,
  `experience` varchar(100) DEFAULT NULL,
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp(),
  `nic` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `epf_num`, `name`, `department`, `designation`, `bod`, `phoneNumber`, `email`, `salary`, `employmentStatus`, `qualifications`, `experience`, `timestamp`, `nic`) VALUES
(8, 2222, 'sathya', '4 - IT', '3 - HR', '2001-09-23', '0987890087', 'nuwa@gmail.com', '400000.00', 'Available', 'test', '7', '2024-03-01 12:43:22', '098765921345');

-- --------------------------------------------------------

--
-- Table structure for table `hr_assistant`
--

CREATE TABLE `hr_assistant` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `designation` varchar(100) DEFAULT NULL,
  `nic` varchar(100) DEFAULT NULL,
  `bod` date DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `working_experince` int(11) DEFAULT NULL,
  `education_qualification` varchar(100) DEFAULT NULL,
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hr_assistant`
--

INSERT INTO `hr_assistant` (`id`, `name`, `address`, `designation`, `nic`, `bod`, `email`, `working_experince`, `education_qualification`, `timestamp`) VALUES
(3, 'Nadun', 'Polonnaruwa', 'IT', '992882978V', '1999-10-19', 'nadun@gmail.com', 2, 'Test', '2024-02-28 12:07:40'),
(5, 'sathyanjali', 'polonnaruwa', 'it', '098764563213', '2001-09-23', 'sathyanja@gmail.com', 2, 'test', '2024-02-28 12:11:55'),
(7, 'sathyanjali abayawardhana', 'Kurunagala', 'Software Engineer', '200012348768', '2001-09-23', 'niwarthana@gmail.com', 5, 'Test', '2024-03-01 16:19:47');

-- --------------------------------------------------------

--
-- Table structure for table `hr_manager`
--

CREATE TABLE `hr_manager` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `nic` varchar(100) DEFAULT NULL,
  `bod` date DEFAULT NULL,
  `education_qualification` varchar(100) DEFAULT NULL,
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hr_manager`
--

INSERT INTO `hr_manager` (`id`, `name`, `email`, `address`, `nic`, `bod`, `education_qualification`, `timestamp`) VALUES
(14, 'Niwarthana sathyanjali', 'sathyanjali00@gmail.com', 'Polonnaruwa', '200178787330', '2001-09-23', 'Test', '2024-03-01 16:17:52');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(1000) NOT NULL,
  `user_type` varchar(100) DEFAULT NULL,
  `telephone_number` varchar(10) DEFAULT NULL CHECK (octet_length(`telephone_number`) = 10),
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `email`, `password`, `user_type`, `telephone_number`, `timestamp`) VALUES
(18, 'sathya@gmail.com', '47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=', 'HR Assistant', '0987896754', '2024-02-28 11:10:51'),
(19, 'sathya@gmail.com', '47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=', 'HR Assistant', '0987896754', '2024-02-28 11:10:59'),
(20, 'sathya@gmail.com', '47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=', 'HR Assistant', '0771762505', '2024-02-28 11:11:21'),
(23, 'admin@gmail.com', '47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=', 'Admin', '0776745321', '2024-02-28 12:11:55'),
(28, 'sathyanjali00@gmail.com', 'LgrU6/DoySHHalPNsx4f5+D9BG/mbH6Jx2O6YR+k4Oo=', 'HR Manager', '0768921346', '2024-03-01 16:17:52'),
(29, 'niwarthana@gmail.com', '5thMeFrB3nL6p4UAc/tWvyH3p6kcTwNJ5e2/E1m1Xtk=', 'HR Assistant', '0778921345', '2024-03-01 16:19:47');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `designation`
--
ALTER TABLE `designation`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nic` (`nic`),
  ADD UNIQUE KEY `phoneNumber` (`phoneNumber`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `hr_assistant`
--
ALTER TABLE `hr_assistant`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hr_manager`
--
ALTER TABLE `hr_manager`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `designation`
--
ALTER TABLE `designation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `hr_assistant`
--
ALTER TABLE `hr_assistant`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `hr_manager`
--
ALTER TABLE `hr_manager`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
