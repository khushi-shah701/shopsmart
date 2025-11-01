# ShopSmart – Smart Retail & Inventory Management App  

## Overview  
**ShopSmart** is a simple Android mobile app built to help small shop owners manage stock and sales efficiently.  
It allows users to **log in**, view **current stock**, navigate to a **profile page**, and **log out** securely.  

The app demonstrates clean UI design using **ConstraintLayout**, **Material Design components**, and navigation through **Intents** in **Kotlin**.
##  Features  

###  Login Screen  
- Users can enter **username** and **password**.  
- Displays a toast message on successful or invalid login.  
- Sends the entered username to the Home screen.

###  Home Screen  
- Displays a **welcome message** with the logged-in username.  
- Shows a **scrollable stock list** with product names and quantities.  
- Includes a **bottom navigation bar** with Home, Profile, and Logout options.  

###  Profile Screen  
- Displays a **profile emoji/picture**.  
- Shows user’s name and general information.  

###  Logout  
- Logs the user out and redirects back to the Login screen.  

##  Tech Stack  

| Component | Technology Used |
|------------|-----------------|
| Language | Kotlin |
| UI Design | XML Layouts |
| Architecture | Activity-based Navigation |
| Libraries | AndroidX, Material Components |
| Minimum SDK | 24 (Android 7.0) |

##  Project Structure  

ShopSmart/
│
├── MainActivity.kt           # Login screen
├── HomeActivity.kt           # Home screen showing stock and navigation
├── ProfileActivity.kt        # Profile page (user details)
│
├── res/
│   ├── layout/
│   │   ├── activity_main.xml     # Login layout
│   │   ├── activity_home.xml     # Home screen layout
│   │   └── activity_profile.xml  # Profile layout
│   ├── drawable/                 # Icons and images
│   ├── values/
│   │   ├── colors.xml
│   │   ├── strings.xml
│   │   └── themes.xml
│
└── AndroidManifest.xml

## 💾 Login Information

There are **no fixed credentials**.
You can enter **any username and password**, and the entered username will appear on the Home screen’s welcome message.

##  Screenshots

| Screen            | Description                               | Preview                                    |
| ----------------- | ----------------------------------------- | ------------------------------------------ |
|  Login Screen   | Enter username & password to continue       |(<img width="395" height="711" alt="image" src="https://github.com/user-attachments/assets/c922d9ad-009d-41d0-a5a8-befa8f3d8cb9" />) |
|  Home Screen    | Displays stock items and navigation icons   |(<img width="435" height="961" alt="image" src="https://github.com/user-attachments/assets/5e39755e-15af-483f-ba33-896761f28221" />) |
|  Profile Screen | Shows profile picture and user info         |(<img width="425" height="952" alt="image" src="https://github.com/user-attachments/assets/f79131e6-f192-48e4-afe6-31c3e9d5ff20" />) |
|  Logout         | Returns to Login page                       |(<img width="429" height="955" alt="image" src="https://github.com/user-attachments/assets/414efd37-c4c9-4790-b830-6766f82128bc" />) |

##  Learning Outcomes

* Implementing multiple screens using **Activities**
* Navigating using **Intents** and **data passing** between screens
* Designing layouts using **ConstraintLayout**, **ScrollView**, and **MaterialCardView**
* Using **Toast messages** for feedback
* Building clean and functional UIs with **Material Design**
