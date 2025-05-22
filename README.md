# TaskProcessor-Java

Java-based task processing system using a priority queue and a LIFO stack to manage pending and in-progress tasks.

## 📌 Description

This project implements a simple task processor with the following features:

- Tasks are added to a **priority queue**, where lower numbers represent higher priority.
- Tasks are started by removing them from the queue and pushing them to a **LIFO stack** (in-progress).
- Tasks can be marked as completed, removing them from the top of the stack.

## 🧠 Concepts Used

- **Priority Queue (FIFO with priority)**: Ensures tasks with higher priority (lower value) are processed first.
- **Stack (LIFO)**: Tasks in progress are managed in a Last-In-First-Out structure.

