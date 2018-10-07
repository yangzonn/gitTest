package testjava;

public class Name {
 private String first;
 private String lastname;
 public Name(String first,String lastname){
  this.first=first;
  this.lastname=lastname;
 }
 public String getFirst() {
  return first;
 }
 public String getLastname() {
  return lastname;
 }
 public String toString() {
  return first + " "+lastname;
 }

}