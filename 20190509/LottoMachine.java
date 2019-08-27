package Day10;

import java.util.Random;

public class LottoMachine {
	int nums[];

	public LottoMachine() {
		nums = new int[6];
	}

	public void createLottoNums() {
		Random m_random = new Random();

		for (int i = 0; i < 6; i++) {
			nums[i] = m_random.nextInt(20);
		}
	}

	public void setNums(int nums[]) {
		this.nums = nums;
	}

	public void checkLottoNums() throws DuplicateException {
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (nums[i] == nums[j])
					throw new DuplicateException();

			}
		}
	}

	public int[] getNums() {
		return nums;
	}
}