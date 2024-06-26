package Exceptions;

//Custom exceptions
class InvalidEmployeeDataException extends Exception {
public InvalidEmployeeDataException(String message) {
super(message);
}
}
class EmployeeAlreadyExistsException extends Exception {
public EmployeeAlreadyExistsException(String message) {
super(message);
}
}
class SalaryBelowMinimumException extends Exception {
public SalaryBelowMinimumException(String message) {
super(message);
}
}
