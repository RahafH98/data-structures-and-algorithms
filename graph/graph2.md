# Graph-breadth-first 
Implement the breadthFirst method in the Graph class, which performs a breadth-first traversal starting from a specified node
## Whiteboard Process
![34.drawio (1).png](..%2F..%2F..%2F..%2FDownloads%2F34.drawio%20%281%29.png)
## Approach & Efficiency
(Approach)
Input Validation:

Check if the specified startNode exists in the graph. If not, throw an IllegalArgumentException.
Traversal Initialization:

Create a set visited to keep track of visited nodes.
Create a queue to perform the breadth-first traversal.
Create a list result to store the order of visited nodes.
Breadth-First Traversal:

Enqueue the startNode to the queue and mark it as visited.
While the queue is not empty:
Dequeue a node from the front of the queue.
Add the dequeued node to the result list.
For each neighbor of the dequeued node that has not been visited:
Mark the neighbor as visited.
Enqueue the neighbor to the queue.


(Efficiency)
- time O(V+E)
- space O(V)
## Solution
![solution.JPG](..%2F..%2F..%2Fsolution.JPG)