package Day10;

class DuplicateException extends Exception {
    DuplicateException() {
    super("�ߺ��� �ζ� ��ȣ�� �߻��߽��ϴ�.");
    }
}

	public class LottoGame {
		public static void main(String[] args) {
		LottoMachine lm= new LottoMachine();
		lm.createLottoNums();
		try {
			lm.checkLottoNums();
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
			return; 
		}
		int num[]=lm.getNums();
		for(int i=0;i<6;i++)
		if(i<5)
		System.out.print(num[i] +",");
		else
			System.out.print(num[i]);
		}
	}