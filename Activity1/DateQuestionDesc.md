## 🧩 Problem: Valid Session Tracker

### 🟢 Problem Description

You are given a list of user sessions in a system.
Each session has:

* a **start time**
* an **end time**

Both times are provided in the format:

```
"yyyy-MM-dd HH:mm:ss"
```

You are also given a **query time**.

Your task is to **count how many sessions are active at the query time**.

---

### 🟢 Definition of “Active Session”

A session is considered **active** at `queryTime` if:

```
startTime <= queryTime < endTime
```

That means:

* The session **must have started before or exactly at** `queryTime`
* The session **must end after** `queryTime`

---

### 🟢 Input Format

* `List<String[]> sessions`

Each element of `sessions` contains **two strings**:

```java
sessions[i][0] → startTime
sessions[i][1] → endTime
```

* `String queryTime`

---

### 🟢 Output Format

Return a **single integer** — the number of active sessions at `queryTime`.

---

### 🟢 Function Signature (Java)

```java
public int countActiveSessions(List<String[]> sessions, String queryTime)
```

---

### 🟢 Example 1

#### Input

```java
sessions = [
    ["2024-01-01 09:00:00", "2024-01-01 10:00:00"],
    ["2024-01-01 09:30:00", "2024-01-01 11:00:00"],
    ["2024-01-01 10:00:00", "2024-01-01 12:00:00"]
]

queryTime = "2024-01-01 09:45:00"
```

#### Output

```text
2
```

#### Explanation

* Session 1 → Active (09:00 ≤ 09:45 < 10:00)
* Session 2 → Active (09:30 ≤ 09:45 < 11:00)
* Session 3 → Not active (starts at 10:00)

---

### 🟢 Example 2

#### Input

```java
sessions = [
    ["2024-01-01 08:00:00", "2024-01-01 09:00:00"],
    ["2024-01-01 09:00:00", "2024-01-01 10:00:00"]
]

queryTime = "2024-01-01 09:00:00"
```

#### Output

```text
1
```

#### Explanation

* First session ends at 09:00 → NOT active
* Second session starts at 09:00 → ACTIVE

---

### 🟢 Constraints

* `1 ≤ sessions.size() ≤ 10^5`
* All date-time strings are valid
* Time zone is **same for all timestamps**
* Sessions may overlap
* `startTime < endTime`

---

## ✍️ What YOU have to do

Implement **only** the function:

```java
public int countActiveSessions(List<String[]> sessions, String queryTime)
```

---