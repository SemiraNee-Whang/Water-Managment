<img width="1041" height="226" alt="image" src="https://github.com/user-attachments/assets/ac61ea9d-6222-4006-9e86-dadc6664d1d3" /><img width="966" height="258" alt="image" src="https://github.com/user-attachments/assets/172bc13c-76b3-4de6-bb68-708f1c7b3a47" /># 💧 Water Management System (Grade 11 IT PAT)

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

## 📝 PAT Phases

You can use this section to explain **each phase of your PAT**. For example:

### Phase 1 – Planning
Check `PAT Phase 1_SemiraWaterManagment.pdf` for detailed infromation
In this phase I have to determine a theme / topic for my PAT, research what data I need to save in a
database, define a data structure and enter data that relates to the topic. In the other phases you will write 
a Java program and extend it to interact with the database and a text file. I only need to focus on one area of the topic in order to create a single table, 
e.g. Products sold by a tuckshop.

My topic data MUST:
- be realistic (don’t have to be real, i.e. you can make it up)
- cover a variety of data types, i.e. Text, Numeric, Date, Yes/No. Use at least three different data types.
- be able to be sorted and fit to do calculations on it

**Proof of Research**
<img width="621" height="748" alt="image" src="https://github.com/user-attachments/assets/f506755b-ae93-48f6-abc2-c713a86bfb81" />
<img width="1125" height="453" alt="image" src="https://github.com/user-attachments/assets/9a2708fd-8615-43ec-bd80-0bc8cd87d45f" />
<img width="1165" height="857" alt="image" src="https://github.com/user-attachments/assets/70c53d62-c8a0-4e4f-97dc-43054c6fb900" />
<img width="918" height="320" alt="image" src="https://github.com/user-attachments/assets/680793c2-cc31-49bd-a761-4c8cfe3879ac" />
<img width="966" height="258" alt="image" src="https://github.com/user-attachments/assets/31c1f2c3-5fb4-420d-ad14-91c230682284" />

**Table design**
<img width="950" height="412" alt="image" src="https://github.com/user-attachments/assets/71bda7f2-63eb-4a3a-a66c-7249e935e6c0" />

**Actual Data**
<img width="1350" height="292" alt="image" src="https://github.com/user-attachments/assets/00c38262-32f1-419c-99e4-24936a0101e2" />

**Calculated/Processed Data**
The amount of water (in megalitres) still available after usage is subtracted from the total capacity. It is calculated as CapacityML - UsedML.
A Yes/No field that shows whether more water was used than allocated. It is Yes if UsedML is greater than AllocatedML, otherwise No.

### Phase 2 – SQL Design
Check `PAT Phase 2_SemiraWaterManagment.pdf` for detailed infromation
In this phase I will design an OOP object definition class to manipulate the information of an instance of an entity
of the topic chosen in Phase 1, e.g. In the tuckshop example, the object definition class will be used to create
product objects. 
- Created the `WaterDB.accdb` database using Microsoft Access.  
- Designed tables for water usage records with appropriate fields and data types.

**Class Diagrams**
<img width="857" height="560" alt="image" src="https://github.com/user-attachments/assets/c291e290-2ca6-4a19-be5a-a82ba728e053" />
<img width="854" height="960" alt="image" src="https://github.com/user-attachments/assets/ccb009f0-9d2e-40e8-8a98-6a03b89be197" />

### Phase 3 – Backend Development
Check `PAT Phase 3_SemiraNee-Whang_11.pdf` for detailed infromation
In this phase you will crate a Java project that uses the database you created in Phase 1 and displays the data on a
GUI screen.
- Implemented Java classes to connect to the database using UCanAccess.  
- Developed methods for **CRUD operations** (Create, Read, Update, Delete).  

**Database Table**
<img width="1041" height="226" alt="image" src="https://github.com/user-attachments/assets/bd825622-0d6b-454b-9d56-22be60f74014" />

**GUI Populated**
<img width="1026" height="260" alt="image" src="https://github.com/user-attachments/assets/71155966-7443-4948-a458-2739efd358c2" />

### Phase 4 – User Interface
Check `PAT Phase 4_SemiraNee-Whang.pdf` for detailed infromation
In this phase you will crate a Java project that uses the database you created in Phase 1 and displays the data on a
GUI screen.
- Designed a graphical user interface (GUI) using NetBeans Swing/AWT.
- Implemented the ability to display water data with filtering and sorting options for easy viewing
- Added functionality to insert new records into the database.
- Added functionality to delete existing records from the database.
- Focused on making the interface user-friendly and intuitive while meeting the PAT requirements.

**GUI: Filter and sorting of data**
<img width="987" height="422" alt="image" src="https://github.com/user-attachments/assets/c175e212-5921-4aca-84ec-f2ddc721964d" />

**GUI: Insert**
<img width="981" height="613" alt="image" src="https://github.com/user-attachments/assets/a82a6bb4-ffa8-420c-a0a0-5493355b8e5d" />

**GUI: Delete**
<img width="570" height="358" alt="image" src="https://github.com/user-attachments/assets/75ce1052-1bad-42c5-a8c5-2846b9f22fa1" />

---

## ⚙️ Setup & How to Run

To run this project, you need **NetBeans IDE** and the **UCanAccess driver**.

### Prerequisites

- **Java Development Kit (JDK):** Ensure a compatible Java version is installed.  
- **NetBeans IDE:** Project configured in NetBeans.

### Installation Steps

1. **Clone the Repository:**

```bash
git clone [Your Repository URL]
cd water-management-pat
