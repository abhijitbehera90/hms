create table patient_appointment( 
id int primary key ,
name varchar(30),
mob varchar(12),
address varchar(100),
 appointment_date  timestamp,
 previous_visit_date  timestamp,
previous_appointment_serial_no int,
registration_no varchar(20)
);