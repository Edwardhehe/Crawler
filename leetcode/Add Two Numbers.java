class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode solution = new ListNode(0);
		ListNode p1 = l1, p2 = l2, p = solution;
		int carry = 0;// 存储进位信息
		int k = 0;// 存储求和信息
		int num1;
		int num2;
		while (p1 != null || p2 != null || carry == 1) {
			//此处必须检查是否非空
			num1 = (p1 == null ? 0 : p1.val);
			num2 = (p2 == null ? 0 : p2.val);
			k = num1 + num2 + carry;
			carry = k / 10;
			p.next = new ListNode(k % 10);
			p = p.next;// 向后推移指针p

			// 向后推移指针p1,p2
			//同样的，必须进行非空检查
			if (p1 != null)
				p1 = p1.next;
			if (p2 != null)
				p2 = p2.next;
		}
		return solution.next;
	}
}
