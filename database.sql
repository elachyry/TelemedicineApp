-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 08, 2023 at 12:51 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `telemedicine`
--
CREATE DATABASE IF NOT EXISTS `telemedicine` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `telemedicine`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(10) NOT NULL,
  `First_Name` varchar(30) NOT NULL,
  `Last_Name` varchar(30) NOT NULL,
  `BirthDay` date NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Phone_Number` varchar(30) NOT NULL,
  `Username` int(30) NOT NULL,
  `Password` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `appointments`
--

CREATE TABLE `appointments` (
  `id` int(10) NOT NULL,
  `Date` varchar(10) NOT NULL,
  `Patient_id` int(10) NOT NULL,
  `Doctor_id` int(10) NOT NULL,
  `Status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `id` int(10) NOT NULL,
  `Image_Path` varchar(255) DEFAULT NULL,
  `First_Name` varchar(30) DEFAULT NULL,
  `Last_Name` varchar(30) DEFAULT NULL,
  `BirthDay` date DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Number_Phone` varchar(30) DEFAULT NULL,
  `Sex` varchar(30) DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `Speciality` varchar(255) DEFAULT NULL,
  `Work_Days` varchar(255) DEFAULT NULL,
  `Work_Hours` varchar(255) DEFAULT NULL,
  `Username` varchar(30) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`id`, `Image_Path`, `First_Name`, `Last_Name`, `BirthDay`, `Email`, `Number_Phone`, `Sex`, `Address`, `Speciality`, `Work_Days`, `Work_Hours`, `Username`, `Password`, `deleted_at`) VALUES
(8, 'C:\\Users\\achyr\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp2\\wtpwebapps\\telemedicneApp\\\\images\\c.PNG', 'mohamed', 'adam', '2023-03-13', 'achyri2ed000@gmail.com', '0680346100', 'Female', 'sadassadsa', 'Urology', 'Monday-Wednesday-Thursday-Friday-Saturday-', '9-11-12-13-16-', 'adam71517', 'mG6s0WIvK8', NULL),
(10, 'C:\\Users\\achyr\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp2\\wtpwebapps\\telemedicneApp\\\\images\\c.PNG', 'mohamed', 'adam', '2023-03-15', 'achyri2000@gmail.com', '0680346100', 'Male', 'sadassadsa', 'Allergy and immunology', 'Monday-Tuesday-', '9-10-', 'adam75658', 'dlA2RmNIazN2dg==', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `id` int(10) NOT NULL,
  `First_Name` varchar(30) DEFAULT NULL,
  `Last_Name` varchar(30) DEFAULT NULL,
  `BirthDay` date DEFAULT NULL,
  `Email` varchar(50) NOT NULL,
  `Number_Phone` varchar(30) NOT NULL,
  `Sex` varchar(30) DEFAULT NULL,
  `Social_Account` varchar(30) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Username` varchar(30) DEFAULT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `appointments`
--
ALTER TABLE `appointments`
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
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `appointments`
--
ALTER TABLE `appointments`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
