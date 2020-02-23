package string����;

public class MatchString {
	private void matchStringByIndex(String parent, String child) {
		int count = 0;
		int index = 0;
		while ((index = parent.indexOf(child, index)) != -1) {
			index = index + child.length();
			count++;
		}
		System.out.println("ƥ�����Ϊ" + count);
	}

	public void matchStringBySplit(String parent, String child) {
		String[] array = parent.split(child);
		System.out.println("ƥ�����Ϊ:" + (array.length - 1));
	}

	public static void main(String[] args) {
		MatchString ms = new MatchString();
		String parent = "You may be out of my sight,but never out of my mind.";
		String child = "my";

		System.out.println("----ͨ��indexOf����----");
		ms.matchStringByIndex(parent, child);

		System.out.println("----ͨ��split����----");
		ms.matchStringByIndex(parent, child);

	}

}
