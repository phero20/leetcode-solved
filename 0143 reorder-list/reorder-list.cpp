/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    void reorderList(ListNode* head) {
        if (!head || !head->next) return;
        ListNode* slow = head;
        ListNode* fast = head;
        while(fast!=nullptr && fast->next!=nullptr) {
            slow = slow->next;
            fast = fast->next->next;
        }
        ListNode* fhead = head;
        ListNode* shead = rev(slow->next);
        slow->next = nullptr;
        while(fhead!=nullptr && shead!=nullptr) {
            ListNode* fh1 = fhead->next;
            ListNode* fh2 = shead->next;
            fhead->next = shead;
            shead->next = fh1;
            fhead = fh1;
            shead = fh2;
        }
    }
    ListNode* rev(ListNode* head) {
        ListNode* prev = nullptr;
        ListNode* curr = head;
        while(curr!=nullptr) {
            ListNode* nxt = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
};