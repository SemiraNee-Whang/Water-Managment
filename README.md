# 💧 Water Management System (Grade 11 IT PAT)

**Practical Assessment Task (PAT) - Information Technology**

This project is a simulation of a fundamental water management system, developed as the Practical Assessment Task (PAT) for Grade 11 Information Technology. It demonstrates skills in database integration, backend logic using Java, and user interface development.

---

## 🚀 Overview

The **Water Management System** is a desktop application designed to track and manage simulated water usage data.

- **Purpose:** To fulfill the requirements of the Grade 11 IT PAT, focusing on integrating a database backend with a graphical Java application.  
- **Data:** All data is simulated for academic purposes. The system is **not connected to real-world infrastructure**.

---

## 💻 Technology Stack

| Component        | Technology              | Description                                                |
|-----------------|------------------------|------------------------------------------------------------|
| Database         | Microsoft Access (.accdb) | Stores all simulated water management records.           |
| Backend Logic    | Java (JDK)             | Handles database connections, queries, data processing, and business logic. |
| User Interface   | NetBeans Swing/AWT     | Provides a graphical interface for users.                |
| Connectivity     | UCanAccess Library     | Enables connection between Java and the Access database. |

---

## ✨ Features

- **Simulated Data Tracking:** Stores records related to water usage, consumption, and supply.  
- **Database Integration:** CRUD operations with `WaterDB.accdb`.  
- **Interactive UI:** User-friendly interface for viewing, filtering, and updating data.  
- **Structured Codebase:** Organized Java code (`src/pat`) for clarity and maintainability.  

---

## 📁 Repository Structure

├── src/
│ └── pat/
│ └── MainApp.java # Main class and backend logic
├── WaterDB.accdb # Microsoft Access Database (Simulated Data)
├── UCanAccess-5.0.*.jar # Required database driver libraries
├── build.xml # NetBeans project build configuration
├── manifest.mf # Manifest file for JAR packaging
└── PAT Phase PDFs/ # Documentation for each phase of the PAT

---

## 📝 PAT Phases

### Phase 1 – Planning
Check `PAT Phase 1_SemiraWaterManagment.pdf` for detailed information.  
In this phase, I had to determine a theme/topic for my PAT, research what data I need to save in a database, define a data structure, and enter data that relates to the topic. The focus is on a single table, e.g., water usage records.

**Requirements for Topic Data:**
- Be realistic (can be simulated, does not need to be real).  
- Include at least three different data types (Text, Numeric, Date, Yes/No).  
- Be sortable and allow calculations.

**Proof of Research:**

![Research 1](https://github.com/user-attachments/assets/f506755b-ae93-48f6-abc2-c713a86bfb81)
<img width="918" height="320" alt="image" src="https://github.com/user-attachments/assets/089361a7-ec28-4d31-be61-9b9acb5cac70" />
<img width="1165" height="857" alt="image" src="https://github.com/user-attachments/assets/03663f23-d9c3-4890-b787-118c826b6d05" />
![Research 2](https://github.com/user-attachments/assets/9a2708fd-8615-43ec-bd80-0bc8cd87d45f)
<img width="966" height="258" alt="image" src="https://github.com/user-attachments/assets/7d587fc9-f2d1-456d-896d-a77c665a7ac6" />

**Table Design:**

![Table Design](https://github.com/user-attachments/assets/71bda7f2-63eb-4a3a-a66c-7249e935e6c0)

**Actual Data:**

![Actual Data](https://github.com/user-attachments/assets/00c38262-32f1-419c-99e4-24936a0101e2)

**Calculated/Processed Data:**  
- Remaining water (in megalitres) = `CapacityML - UsedML`  
- Yes/No field shows whether more water was used than allocated (`Yes` if `UsedML > AllocatedML`, otherwise `No`).

---

### Phase 2 – SQL Design
Check `PAT Phase 2_SemiraWaterManagment.pdf` for detailed information.  
In this phase, I created an **OOP class** to manipulate entity data, e.g., water record objects.  

- Created the `WaterDB.accdb` database using Microsoft Access.  
- Designed tables for water usage records with appropriate fields and data types.

**Class Diagrams:**

![Class Diagram 1](https://github.com/user-attachments/assets/c291e290-2ca6-4a19-be5a-a82ba728e053)
![Class Diagram 2](https://github.com/user-attachments/assets/ccb009f0-9d2e-40e8-8a98-6a03b89be197)

---

### Phase 3 – Backend Development
Check `PAT Phase 3_SemiraNee-Whang_11.pdf` for detailed information.  
- Implemented Java classes to connect to the database using UCanAccess.  
- Developed methods for **CRUD operations** (Create, Read, Update, Delete).

**Database Table:**

![Database Table](https://github.com/user-attachments/assets/bd825622-0d6b-454b-9d56-22be60f74014)

**GUI Populated:**

![GUI Populated](https://github.com/user-attachments/assets/71155966-7443-4948-a458-2739efd358c2)

---

### Phase 4 – User Interface
Check `PAT Phase 4_SemiraNee-Whang.pdf` for detailed information.  
- Designed a graphical user interface (GUI) using **NetBeans Swing/AWT**.  
- Implemented the ability to **display water data** with **filtering and sorting options**.  
- Added functionality to **insert new records** into the database.  
- Added functionality to **delete existing records** from the database.  
- Focused on making the interface **user-friendly and intuitive** while meeting PAT requirements.

**GUI: Filter and Sorting:**

![Filter & Sorting](https://github.com/user-attachments/assets/c175e212-5921-4aca-84ec-f2ddc721964d)

**GUI: Insert Record:**

![Insert](https://github.com/user-attachments/assets/a82a6bb4-ffa8-420c-a0a0-5493355b8e5d)

**GUI: Delete Record:**

![Delete](https://github.com/user-attachments/assets/75ce1052-1bad-42c5-a8c5-2846b9f22fa1)

---
## ⚠️ Notes

This project is for school assessment purposes only.

The database contains simulated data.

All code and resources are maintained for version control and organization.

--- 

## ⚙️ Setup & How to Run

### Prerequisites

- **Java Development Kit (JDK)**  
- **NetBeans IDE**  

### Installation Steps

1. **Clone the Repository:**

`git clone [Your Repository URL]
cd water-management-pat`

2.   **Open in NetBeans**

Open NetBeans and select File > Open Project.
Navigate to and select the cloned water-management-pat directory.

3. **Link UCanAccess Library**

In the NetBeans Projects window, right-click the project name.
Select Properties > Libraries.
Add UCanAccess-5.0.*.jar and all dependency jars to the classpath.

4. **Run the Application**

Right-click the project in the Projects window and select Run.
Alternatively, run the main class directly from src/pat/MainApp.java.
