/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// 先前居然沒看懂題目 XD https://www.bilibili.com/video/BV1SG411C7TH/?spm_id_from=333.337.search-card.all.click&vd_source=110cf687c2a9c66ee5407339348e6ebf

// 合併鏈表實現同步移動
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //p1 指向 A 鏈表頭結點，p2 指向 B 鏈表頭結點
        ListNode p1 =  headA, p2 = headB;
        while (p1 != p2){
            //p1 走一步，如果走到 A 鏈表末尾，轉到 B 鏈表
            if (p1 == null) p1 = headB;
            else p1 = p1.next;
            //p2 走一步，如果走到 B 鏈表末尾，轉到 A 鏈表
            if (p2 == null) p2 = headA;
            else p2 = p2.next;
        }
        return p1;
    }
}