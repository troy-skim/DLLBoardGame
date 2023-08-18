# DLLBoardGame

A Board Game made with Doubly Linked List. DoublyLinkedList.java was copied from the book Data Structures and Algorithms in Java, Sixth Edition, by Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser. 

Finished on July 12, 2023. 

## Folder Structure

App.java                -> driver program
Block.java              -> represents each blocks (squares)
Player.java             -> represents each players
Board.java              -> represents the board
DoublyLinkedList.java   -> copied from the textbook, one custom method added at the bottom

apache commons lang3 dependency should be in the lib folder.

## Dependencies

Need Apache Commons Lang3 jar file. 

## Board Game Rules

Players start at "Start" and roll a dice (1-6).
Move forward the rolled number of colored blocks.
If the square is empty, add its number to the player's score.
If occupied, move the previous player back 7 spaces and add square's number to current player's score.
A player moving back 7 and sharing a block has no effect.
Going back past the 1st square puts player at "Start."
Game ends if player reaches or exceeds "End" with ≥44 points or goes back to "Start" otherwise.
Simulate 1000 games with Player A, record average winning moves.
Repeat simulation with Player A and B up to 4 players, display results.

Board: Start, 5, 10, 8, 10, 7, 5, 9, 10, 6, 7, 10, 6, 5, 8, 9, 5, 10, 5, 9, 6, 8, 7, 10, 6, 8, End
