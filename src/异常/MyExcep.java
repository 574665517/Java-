package �쳣;

@SuppressWarnings("serial")
public class MyExcep extends NumberFormatException {
	public MyExcep() {
		System.out.println("�����˷Ǵ�д��ĸ!");
	}

	static class MyException {
		public static void inputChar() {
			try {
				char c;
				while (true) {
					c = (char) System.in.read();
					if (c >= 'A' && c <= 'Z') {
						System.out.println(c);
					} else {
						throw new MyExcep();
					}
				}
			} catch (Exception e) {
			}
		}

		public void main(String[] args) {
			MyException.inputChar();
		}

	}
}
