package testjava;

public class Count3Quit {
 public static void main(String[] args){
       boolean[] arr = new boolean[500];
       
       for(int i =0;i<arr.length;i++) {
       arr[i] = true;
     
       }
  int leftcount = arr.length;
  int countNum = 0;
  int index = 0;
  while (leftcount > 1){
   if(arr[index] ){
    countNum ++;}
    if(countNum ==3){
     countNum =0;
     arr[index]=false;
     leftcount--;
    }
    index ++;

    if(index == 500){
     index = 0;
    }
   }
   for(int i=0; i<arr.length; i++){
    if(arr[i]){
     System.out.println(i);
    }
   }

  }
 }