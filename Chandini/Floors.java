public class Floors {
    public static void main(String args[]){
        int[][] arr = {{101},{201,202},{301,302,303},{401,402,403,404},{501,502,503,504,505}};
        for(int i=0;i<arr.length;i++){
            System.out.println("Floor No:"+(i+1));
            for(int j=0;j<arr[i].length;j++){
                System.out.println("        Room No :"+arr[i][j]);
            }
            
        }

    }
}
