package com.insight.day2;

public class instrument_Test {

	public static void main(String[] args) {
		Instrument[] i=new Instrument[10];
		i[0]=new piano();
		i[1]=new flute();
		i[2]=new guitar();
		i[3]=new piano();
		i[4]=new guitar();
		i[5]=new flute();
		i[6]=new piano();
		i[7]=new flute();;
		i[8]=new piano();
		i[9]=new piano();
		for(Instrument inn:i) {
			inn.play();
		}
		for(int j=0;j<i.length;j++) {
			if(i[j] instanceof piano) {
				System.out.println(j+" is piano");
			}
			else if(i[j] instanceof guitar) {
				System.out.println(j+" is guitar");
			}
			else if(i[j] instanceof flute) {
				System.out.println(j+" is flute");
			}
		}
	}

}
