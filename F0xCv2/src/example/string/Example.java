package example.string;

//Testing of arrays
public class Example {
	public static void main(String[] args) {
		/*for(int i=0;i<10;i++) {
			Sys.print("ping\n");
			Sys.print("pong\n");
			Sys.print("huihui\n");
			Sys.print(new String("pong\n"));
		}*/
		System.out.println(v());
		String r = "ping ";
		String s = "pong!";
		System.out.println(r.concat(s));
		System.out.println(" :O".toString());
		System.out.println("-#OO#-".replace('#', '|'));
		System.out.println("-#OO#-".replace("#", "|"));
		System.out.println("-#OO#-".replaceAll("#", "|"));
		System.out.println("cheesecake".split("e")[3]);
		
	}
	public static String v() { return "123"; }
}
