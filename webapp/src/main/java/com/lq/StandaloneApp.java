package com.lq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class StandaloneApp {

	public static void main(String[] args) throws Exception {
		System.out.println("======================== Salut alex cool \\0-0/ ! :)==========================");
		System.out.println("=============== Where we're going, we don't need roads. =============");
		System.out.println("=====================================================================");
		System.out.println("                                 _..-------++._");
		System.out.println("                             _.-'/ |      _||  \"--._");
		System.out.println("                       __.--'`._/_\\j_____/_||___\\    `----.");
		System.out.println("                  _.--'_____    |          \\     _____    /");
		System.out.println("                _j    /,---.\\   |        =o |   /,---.\\   |_");
		System.out.println("               [__]==// .-. \\\\==`===========/==// .-. \\\\=[__]");
		System.out.println("                 `-._|\\ `-' /|___\\_________/___|\\ `-' /|_.'");
		System.out.println("                       `---'                     `---'");
		System.out.println("====================================================================");
		System.out.println("========================== System env props ============================");
		
		Map<String, String> env = System.getenv();
		List<String> keys = new ArrayList<String>();
        for (String key : env.keySet()) {
        	keys.add(key);
        }
		Collections.sort(keys);
		for(String key : keys) {
			  System.out.println(key +" = " + env.get(key));
		}
		System.out.println("====================================================================");
		System.out.println("========================== App args ============================");
		for(int i=0; i<args.length; i++)
		{
			System.out.println("args[" + i + "] = " + args[i]);
		}
		System.out.println("====================================================================");
		
		System.out.println("========================== DB_URL ============================");
		System.out.println( env.get("DB_URL") );
		System.out.println("====================================================================");
		
		MysqlApp msql = new MysqlApp();
		while(true)
		{	
			try {
				Thread.sleep(1000);	
				msql.readDataBase( env.get("DB_URL")  );
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
