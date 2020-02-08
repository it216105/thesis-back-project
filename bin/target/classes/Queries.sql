CREATE TABLE `thesis` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`first_name` varchar(255) DEFAULT NULL,
 `key_words` varchar(255) DEFAULT NULL,
 `last_name` varchar(255) DEFAULT NULL,
 `subject` varchar(255) DEFAULT NULL,
 `teacher` varchar(255) DEFAULT NULL,
 `type` varchar(255) DEFAULT NULL,
 PRIMARY KEY (`id`) );

CREATE TABLE `users` (   `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `owes_lessons` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `year_of_studies` varchar(255) DEFAULT NULL,
  `activate` Boolean DEFAULT NULL,
  PRIMARY KEY (`id`) )

