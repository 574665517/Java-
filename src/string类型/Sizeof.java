package string¿‡–Õ;

public class Sizeof {

	public static void main(String[] args) {
		char[] bin = {1,1,1,1,0,0,0,1,1,0,0,1,1,1,0,0,0,1,1,1,1,1,1};
		char[] aux = {1,1,1,1,1};
		//flag is used to record the number of  "1" states
		for(int i = 0, m = 0, flag = 0;i < 6;++m) {
			if(bin[i] == '0') {
				flag = 0;
				aux[m] = bin[i];
				++i;
			}else {
				++flag;
				aux[m] = bin[i];
				++i;
				if(flag == 5) {
					aux[++m] = '0';
					flag = 0;
				}
			}
		}

	}

}
