package com.City.task;

public class Malls {
		String name;
		int floors;
		int shops;
		int vehicals;
		double parkingarea;
		String address;
		
			void Mallentry() {
				System.out.println(this.name +"entry from right side of the mall");
			}
			void parking() {
				System.out.println(this.parkingarea +"more than 80 vehicals will park");
			}
			
				Malls(String name,int floors,int shops,int vehicals,double parkingarea,String address){
					this.name=name;
					this.floors=floors;
					this.shops=shops;
					this.vehicals=vehicals;
					this.parkingarea=parkingarea;
					this.address=address;	
				}
}
