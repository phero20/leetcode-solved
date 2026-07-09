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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* h1 = list1;
        ListNode* h2 = list2;
        ListNode* neww = new ListNode(0, nullptr);
        ListNode* curr = neww;

        while (h1 != nullptr && h2 != nullptr) {
            if (h1->val < h2->val) {
                curr->next = h1;
                h1 = h1->next;
            } else {
                curr->next = h2;
                h2 = h2->next;
            }
            curr = curr->next;
        }

        while (h1 != nullptr) {
            curr->next = h1;
            h1 = h1->next;
            curr = curr->next;
        }

        while (h2 != nullptr) {
            curr->next = h2;
            h2 = h2->next;
            curr = curr->next;
        }

        return neww->next;
    }
};
