public class floors {
    public static void main(String[] args) {
        
        int floorno1[]={101,102,103,104};
        int floorno2[]={201,203,203,204,205};
        int floorno3[]={301,302,303,304,305,306};
        int floorno4[]={401,402,403,404,405,406,407};
        int floorno5[]={501,502,503,504,506,507,508};
            System.out.println("floor-1");
    
            for(int i=0;i<floorno1.length;i++){
               System.out.println("floor"+floorno1[i]);
            }
            System.out.println("floor-2");
            for(int j=0;j<floorno2.length;j++){
               System.out.println("floor"+floorno2[j]);
            }
            System.out.println("floor-3");
            for(int k=0;k<floorno3.length;k++){
            if(k>=0&&k<6){ 
            continue;
            } 
            System.out.println("floor"+floorno3[k]);
            }
          
            System.out.println("floor-4");
            for(int l=0;l<floorno4.length;l++){
              System.out.println("floor"+floorno4[l]);
            
            }
            System.out.println("floor-5");
            for(int m=0;m<floorno5.length;m++){
               System.out.println("floor"+floorno5[m]);
 }
 }     

}

