package com.City.task;

public class PoliceStation {
		String name;
		int lights;
		int cells;
		int fans;
		int officers;
		String address;
		
			void police() {
				System.out.println(this.name +"wrriten compliant");
			}
			void officers() {
				System.out.println(this.officers +"two CI's one SI");
			}
			
				PoliceStation(String name,int lights,int cells,int fans,int officers,String address){
					this.name=name;
					this.address=address;
					this.lights=lights;
					this.cells=cells;
					this.fans=fans;
					this.officers=officers;
				}
}
