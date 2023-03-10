-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 10, 2023 at 12:11 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12
=======

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `telemedicine`
--

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `appointments`
--

CREATE TABLE `appointments` (
  `id` int(10) NOT NULL,
  `Date` varchar(10) NOT NULL,
  `Time` varchar(30) NOT NULL,
  `Patient_id` int(10) NOT NULL,
  `Doctor_id` int(10) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `amount` double NOT NULL,
  `action` varchar(30) NOT NULL,
  `Link` varchar(30) NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appointments`
--

INSERT INTO `appointments` (`id`, `Date`, `Time`, `Patient_id`, `Doctor_id`, `Status`, `amount`, `action`, `Link`, `deleted_at`) VALUES
(1, '2022-03-22', '', 2, 8, 'Pending', 0, '', '', NULL);

>>>>>>> master
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
=======

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`id`, `Image_Path`, `First_Name`, `Last_Name`, `BirthDay`, `Email`, `Number_Phone`, `Sex`, `Address`, `Speciality`, `Work_Days`, `Work_Hours`, `Username`, `Password`, `deleted_at`) VALUES
(8, 'C:\\Users\\achyr\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp2\\wtpwebapps\\telemedicneApp\\\\images\\c.PNG', 'mohamed', 'adam', '2023-03-13', 'achyri2ed000@gmail.com', '0680346100', 'Female', 'sadassadsa', 'Urology', 'Monday-Wednesday-Thursday-Friday-Saturday-', '9-11-12-13-16-', 'adam71517', 'mG6s0WIvK8', NULL),
(10, 'C:\\Users\\achyr\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp2\\wtpwebapps\\telemedicneApp\\\\images\\c.PNG', 'mohamed', 'adam', '2023-03-15', 'achyri2000@gmail.com', '0680346100', 'Male', 'sadassadsa', 'Allergy and immunology', 'Monday-Tuesday-', '9-10-', 'adam77072', 'c1c0R1Jrb2ZsWA==', NULL);
>>>>>>> master

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `id` int(10) NOT NULL,
  `First_Name` varchar(30) ,
  `Last_Name` varchar(30),
  `BirthDay` date ,
  `Email` varchar(50) NOT NULL,
  `Number_Phone` varchar(30) NOT NULL,

  `Sex` varchar(30) DEFAULT NULL,
  `Social_Account` varchar(30) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Username` varchar(30) DEFAULT NULL,
  `Password` varchar(30) NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
=======

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`id`, `Image_Path`, `First_Name`, `Last_Name`, `BirthDay`, `Email`, `Number_Phone`, `Sex`, `Social_Account`, `Address`, `Username`, `Password`, `deleted_at`) VALUES
(2, 'C:\\Users\\achyr\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp2\\wtpwebapps\\telemedicneApp\\\\images\\c.PNG', 'Mohammed', 'Elachyry', '2023-03-09', 'mohammedelachyry@gmailcom', '0661705486', 'Male', '01478932158', 'hay nahda', 'Elachyry48726', 'dkc1RHp5aExwag==', NULL);
>>>>>>> master

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
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;