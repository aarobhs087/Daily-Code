/*
Structure of linked list is as
struct Node
{
    int data;
    struct Node* npx;

    Node(int x){
        data = x;
        npx = NULL;
    }
};

Utility function to get XOR of two Struct Node pointer
use this function to get XOR of two pointers
struct Node* XOR (struct Node *a, struct Node *b)
{
    return (struct Node*) ((uintptr_t) (a) ^ (uintptr_t) (b));
}
*/

// Node* XOR(Node* a, Node* b) {
//     return (Node*)((uintptr_t)(a) ^ (uintptr_t)(b));
// }

// Function to insert data at the front of the XOR linked list
Node* insert(Node* head, int data) {
    Node* newNode = new Node(data);
    
    // Set npx of newNode as XOR of NULL and head
    newNode->npx = XOR(NULL, head);

    // If head is not NULL, update the head's npx
    if (head != NULL) {
        head->npx = XOR(newNode, XOR(NULL, head->npx)); // Update npx for the old head
    }

    return newNode; // New node becomes the new head
}

// Function to retrieve the linked list as a vector
vector<int> getList(Node* head) {
    vector<int> result;
    Node* curr = head;
    Node* prev = NULL;

    // Forward traversal
    while (curr != NULL) {
        result.push_back(curr->data); // Add current node's data to the result
        Node* next = XOR(prev, curr->npx); // Get the next node using XOR
        prev = curr; // Move prev to current
        curr = next; // Move current to next
    }

    return result; // Return the vector containing the list elements
}
