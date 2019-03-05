-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 05, 2019 at 04:21 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `busapp`
--
CREATE DATABASE IF NOT EXISTS `busapp` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `busapp`;

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

CREATE TABLE IF NOT EXISTS `bus` (
  `busid` int(11) NOT NULL,
  `busno` varchar(255) DEFAULT NULL,
  `buslocation_stopid` int(11) DEFAULT NULL,
  PRIMARY KEY (`busid`),
  KEY `FKhi1rcp3m23uhyyqgrt00mygrq` (`buslocation_stopid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus`
--

INSERT INTO `bus` (`busid`, `busno`, `buslocation_stopid`) VALUES
(101, '4177', 901),
(102, '4171', 901),
(103, '4172', 905),
(104, '4175', 905);

-- --------------------------------------------------------

--
-- Table structure for table `conductor`
--

CREATE TABLE IF NOT EXISTS `conductor` (
  `conductorid` int(11) NOT NULL,
  `conductorfirstname` varchar(255) NOT NULL,
  `conductorlastname` varchar(255) DEFAULT NULL,
  `conductorphone` varchar(10) NOT NULL,
  `conductorlocation_stopid` int(11) NOT NULL,
  PRIMARY KEY (`conductorid`),
  KEY `FK80bj68fisarcvlfdyovqr7lfv` (`conductorlocation_stopid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `conductor`
--

INSERT INTO `conductor` (`conductorid`, `conductorfirstname`, `conductorlastname`, `conductorphone`, `conductorlocation_stopid`) VALUES
(201, 'Vijay', 'LastName', '9999999998', 901),
(202, 'Rajesh', 'LastName', '9999999997', 901),
(203, 'Nilesh', 'LastName', '9999999996', 905),
(204, 'Suresh', 'LastName', '9999999995', 905);

-- --------------------------------------------------------

--
-- Table structure for table `driver`
--

CREATE TABLE IF NOT EXISTS `driver` (
  `driverid` int(11) NOT NULL,
  `driverfirstname` varchar(255) NOT NULL,
  `driverlastname` varchar(255) DEFAULT NULL,
  `driverphone` varchar(10) NOT NULL,
  `driverlocation_stopid` int(11) NOT NULL,
  PRIMARY KEY (`driverid`),
  KEY `FKccptgq6tb8pk2hx9yu48qi1si` (`driverlocation_stopid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `driver`
--

INSERT INTO `driver` (`driverid`, `driverfirstname`, `driverlastname`, `driverphone`, `driverlocation_stopid`) VALUES
(301, 'Ravi', 'LastName', '8888888888', 901),
(302, 'Bhima', 'LastName', '8888888887', 901),
(303, 'Shyam', 'LastName', '8888888886', 905),
(304, 'Sanjay', 'LastName', '8888888885', 905);

-- --------------------------------------------------------

--
-- Table structure for table `route`
--

CREATE TABLE IF NOT EXISTS `route` (
  `routeid` int(11) NOT NULL,
  `destination_stopid` int(11) NOT NULL,
  `source_stopid` int(11) NOT NULL,
  `via_stopid` int(11) NOT NULL,
  PRIMARY KEY (`routeid`),
  KEY `FKd0qwm82670dr585q2wfnv8ffc` (`destination_stopid`),
  KEY `FKr4v4wywqi04174awl8tsp93yj` (`source_stopid`),
  KEY `FK6vngl7paf1bpw691wo5wah5k` (`via_stopid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `route`
--

INSERT INTO `route` (`routeid`, `destination_stopid`, `source_stopid`, `via_stopid`) VALUES
(401, 905, 901, 903),
(402, 905, 901, 902),
(403, 901, 905, 904),
(404, 901, 905, 902);

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

CREATE TABLE IF NOT EXISTS `schedule` (
  `scheduleid` int(11) NOT NULL,
  `arrivaltime` datetime DEFAULT NULL,
  `departuretime` datetime DEFAULT NULL,
  `scheduledate` datetime DEFAULT NULL,
  `scheduleday` varchar(255) DEFAULT NULL,
  `busid_busid` int(11) DEFAULT NULL,
  `conductorid_conductorid` int(11) DEFAULT NULL,
  `driverid_driverid` int(11) DEFAULT NULL,
  `routeid_routeid` int(11) DEFAULT NULL,
  PRIMARY KEY (`scheduleid`),
  KEY `FKsgqop0kp32mqaiwrd5wx5hy3y` (`busid_busid`),
  KEY `FKi99op5seny1jagfwobvxytwg8` (`conductorid_conductorid`),
  KEY `FK8qxg8672v4mgn66i6xn29vu0o` (`driverid_driverid`),
  KEY `FK6bnhgw4x17mhflql0h63p3ho0` (`routeid_routeid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `stop`
--

CREATE TABLE IF NOT EXISTS `stop` (
  `stopid` int(11) NOT NULL,
  `stoplocation` varchar(255) DEFAULT NULL,
  `stopname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stopid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stop`
--

INSERT INTO `stop` (`stopid`, `stoplocation`, `stopname`) VALUES
(901, 'Kolhapur', 'Kolhapur CBS'),
(902, 'Kolhapur', 'Shiroli'),
(903, 'Panhala', 'Waghbil'),
(904, 'Panhala', 'Kodoli'),
(905, 'WaranaNagar', 'TKIET');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `usertype` varchar(255) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
