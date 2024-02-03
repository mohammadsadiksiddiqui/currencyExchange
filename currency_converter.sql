-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2018 at 10:03 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 5.6.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `currency_converter`
--

-- --------------------------------------------------------

--
-- Table structure for table `commission`
--

CREATE TABLE `commission` (
  `srno` int(11) NOT NULL,
  `customer_mobile` varchar(15) NOT NULL,
  `commission_amount` double NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `commission`
--

INSERT INTO `commission` (`srno`, `customer_mobile`, `commission_amount`) VALUES
(1, '9827571234', 130.33999633789062),
(2, '9015521020', 65.16999816894531),
(3, '9015521020', 164916),
(4, '9015521020', 1177971.5),
(5, '9015521020', 177329.046875),
(6, '9015521020', 1177971.5),
(7, '9015521020', 214176.625),
(8, '9015521020', 6123.876953125),
(9, '9015521020', 214176.625),
(10, '9015521020', 824580),
(11, '9015521020', 130.33999633789062);

-- --------------------------------------------------------

--
-- Table structure for table `currency_value`
--

CREATE TABLE `currency_value` (
  `currency_id` int(11) NOT NULL,
  `currencyname` varchar(25) NOT NULL,
  `currencyvalue` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `currency_value`
--

INSERT INTO `currency_value` (`currency_id`, `currencyname`, `currencyvalue`) VALUES
(1, 'Indian Rupee', 1),
(2, 'US Dollar', 65.17),
(3, 'Afghani', 0.93),
(4, 'Armenian Dram', 0.14),
(5, 'Bangladeshi Taka', 0.77),
(6, 'Cambodian Riel', 0.016),
(7, 'Chinese Yuan', 10.36),
(8, 'Georgian Lari', 26.93),
(9, 'Hong Kong Dollar', 8.3),
(10, 'Indonesian Rupiah', 0.0047),
(11, 'Japanese Yen', 0.61),
(12, 'Kazakhstani Tenge', 0.2),
(13, 'Lao Kip', 0.0078),
(14, 'Malaysian Ringgit', 16.85),
(15, 'South Korean Won', 0.061),
(16, 'Sri Lankan Rupee', 0.42),
(17, 'Maldivian Rufiyaa', 4.23),
(18, 'Pakistani Rupee', 0.56),
(19, 'Philippine Peso', 1.25),
(20, 'Thai Baht', 2.08),
(21, 'Taiwanese Dollar', 2.23),
(22, 'Vietnamese Dong', 0.0028),
(23, 'Bahraini Dinar', 172.82),
(24, 'Emirati Dirham', 17.74),
(25, 'Saudi Arabian Riyal', 17.38),
(26, 'Omani Rial', 169.27),
(27, 'Israeli Shekel', 18.61),
(28, 'Iraqi Dinar', 0.055),
(29, 'Iranian Rial', 0.002),
(30, 'Icelandic Krona', 0.66),
(31, 'kuwaiti Dinar', 217.43),
(32, 'Lebanese Pound', 0.043),
(33, 'Qatari Riyal', 17.9),
(34, 'Libyan Dinar', 48.99),
(35, 'Bosnian Convertible Marka', 41.01),
(36, 'Euro', 80.21),
(37, 'Bulgarian Lev', 41.01),
(38, 'Czech Koruna', 3.15),
(39, 'Croatian Kuna', 10.79),
(40, 'Danish Krone', 10.76),
(41, 'Hungarian Forint', 0.26),
(42, 'Moldovan Leu', 3.96),
(43, 'Macedonian Denar', 1.3),
(44, 'Norwegian Krone', 8.28),
(45, 'Polish Zloty', 19.04),
(46, 'Romanian Leu', 17.21),
(47, 'Serbian Denar', 0.68),
(48, 'Russian Ruble', 1.13),
(49, 'Swedish Krona', 7.8),
(50, 'Swiss Franc', 68.05),
(51, 'Turkish Lira', 16.29),
(52, 'Ukranian Hryvnia', 2.45),
(53, 'British Pound', 91.62);

-- --------------------------------------------------------

--
-- Table structure for table `customerdetail`
--

CREATE TABLE `customerdetail` (
  `mobile` varchar(15) NOT NULL,
  `name` varchar(25) NOT NULL,
  `adhar` varchar(12) DEFAULT NULL,
  `dob` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customerdetail`
--

INSERT INTO `customerdetail` (`mobile`, `name`, `adhar`, `dob`) VALUES
('9015521020', 'shakir', '561084421995', '1995-10-26'),
('9827571234', 'sadik', '979032030702', '1990-03-14');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `name` varchar(25) DEFAULT NULL,
  `mobile_number` varchar(10) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  `user_id` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`name`, `mobile_number`, `password`, `user_id`) VALUES
('chand', '9891273383', '0987', 'chand123'),
('swaleha', '98765427', '1234', 'gazal123'),
('shakir', '8723498289', '12ab', 'sha'),
('shakir', '1234567899', '12345', 'shakir123'),
('shrawan', '9028383838', '5678', 'shrawan123'),
('sadik', '9827571234', '12345', 'sid'),
('waseem ', '986598989', '1234', 'wasi007');

-- --------------------------------------------------------

--
-- Table structure for table `transfer`
--

CREATE TABLE `transfer` (
  `transfer_id` int(11) NOT NULL,
  `customer_mobile` varchar(15) NOT NULL,
  `from_currency_id` varchar(25) DEFAULT NULL,
  `to_currency_id` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transfer`
--

INSERT INTO `transfer` (`transfer_id`, `customer_mobile`, `from_currency_id`, `to_currency_id`) VALUES
(101, '9827571234', '2', '1'),
(102, '9015521020', '2', '1'),
(103, '9015521020', '53', '1'),
(104, '9015521020', '53', '4'),
(105, '9015521020', '53', '3'),
(106, '9015521020', '53', '4'),
(107, '9015521020', '53', '5'),
(108, '9015521020', '53', '8'),
(109, '9015521020', '53', '5'),
(110, '9015521020', '53', '12'),
(111, '9015521020', '2', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `commission`
--
ALTER TABLE `commission`
  ADD PRIMARY KEY (`srno`),
  ADD KEY `customer_mobile` (`customer_mobile`);

--
-- Indexes for table `currency_value`
--
ALTER TABLE `currency_value`
  ADD PRIMARY KEY (`currency_id`);

--
-- Indexes for table `customerdetail`
--
ALTER TABLE `customerdetail`
  ADD PRIMARY KEY (`mobile`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `transfer`
--
ALTER TABLE `transfer`
  ADD PRIMARY KEY (`transfer_id`),
  ADD KEY `customer_mobile` (`customer_mobile`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `commission`
--
ALTER TABLE `commission`
  MODIFY `srno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `currency_value`
--
ALTER TABLE `currency_value`
  MODIFY `currency_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT for table `transfer`
--
ALTER TABLE `transfer`
  MODIFY `transfer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=112;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `commission`
--
ALTER TABLE `commission`
  ADD CONSTRAINT `commission_ibfk_1` FOREIGN KEY (`customer_mobile`) REFERENCES `customerdetail` (`mobile`);

--
-- Constraints for table `transfer`
--
ALTER TABLE `transfer`
  ADD CONSTRAINT `transfer_ibfk_1` FOREIGN KEY (`customer_mobile`) REFERENCES `customerdetail` (`mobile`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
