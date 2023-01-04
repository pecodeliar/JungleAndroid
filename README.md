<p align="center">
  <img src="https://i.imgur.com/7z2P7YU.png" alt="Jungle Logo" width="400" height="150">
 </p>

## Languages and Technologies Used
<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin Badge"> <img src="https://i.imgur.com/3ksanbk.png" alt="Jetpack Compose Badge"height="28"> <img src="https://img.shields.io/badge/Android_Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white" alt="Android Badge"> 
</p>

## Overview

This project is a frontend mock of the Android Google App. My desire was to escape what is usually called "Tutorial Purgatory" and really come out of my comfort zone of only starting projects that have all the steps laid out for you.
\
&nbsp;

## Discover Screen

<p>
   <img align="right" src="https://i.imgur.com/vUrsMJx.gif" alt="Discover Screen Demo Gif" width="145"> <img align="right" src="https://i.imgur.com/ZN5GNdc.png" alt="Discover Screen Preferences Modal" width="150"> <img align="right" src="https://i.imgur.com/A5709uo.png" alt="Discover Screen Stories" width="150"> <img align="right" src="https://i.imgur.com/8XlVV6g.png" alt="Start of Discover Screen" width="150">
<ul>
  <li>Learned about utilizing data classes to make models for the articles and stories. I made use of the Lazy Column to show the items with a scrolling ability.</li>
  <li>Learned about modals which is activated when the more (three dots) button is clicked. The favorite (heart) button also makes use of a Boolean that will changed to a filled heart if clicked.</li>
  <li>One of the main components of the screen is the "search bar". At first, it was made as an actual search bar, until I realized that it was just a cleverly disguised button. I mimic the look of a bar within the button and once the button is click, it autmatically leads you to the Search Screen.</li>
</ul> 
</p>

<br>


## Collections Screen

<p>
  <img align="right" src="https://i.imgur.com/CkQSxKL.gif" alt="Collections Screen Demo" width="145"> <img align="right" src="https://i.imgur.com/8iaD2oh.png" alt="Collections Placeholder and Bookmark Cards" width="150"> <img align="right" src="https://i.imgur.com/HVVSJBh.png" alt="Collections Quick Access" width="150"> 
<ul>
  <li>Made use of enum classes for the bookmark boxes and placeholder cards.</li>
  <li>For each section, objects were used to mimic search suggestion data that was displayed using a Lazy Row component.</li>
</ul> 
</p>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

## Search Screen

<p>
  <img align="right" src="https://i.imgur.com/wMZBPp4.gif" alt="Search Screen Demo" width="145"> <img align="right" src="https://i.imgur.com/J3fY1Yt.png" alt="Search Query that Redirects to Google" width="150"> <img align="right" src="https://i.imgur.com/hqPpjOe.png" alt="Search Screen" width="150"> 
<ul>
  <li>Once this screen is navigated to, it automatically displays the user's keyboard to mimic the behavior of the Google App.</li>
  <li>Making use of a keyboard action, the user can type a query and it will direct them to the real google search</li>
  <li>Made use of an object to create fake history searches that are searches that did was made to help make this project.</li>
</ul> 
</p>


<br>
<br>
<br>
<br>

## Common Items Between Screens

<p>
  <img align="right" src="https://i.imgur.com/13p6pQ7.gif" alt="Accounts Menu and Navigation Bar Demo" width="145"> <img align="right" src="https://i.imgur.com/q9tV7Ap.png" alt="Accounts Menu Shared by Collections and Discover Screen" width="150"> 
<ul>
  <li>Learned about Navigation between screens for Jetpack for activities. I used a Nav host to help with displaying the screens as well as the navigation bar at the bottom of the application. </li>
  <li>The above also helped with displaying the Modal that is used during on the Discover Screen with the use of a Scaffold.</li>
  <li>The profile picture in the corner of the Discover and Collections Screen will display a Popup once clicked that mimics an accounts menu.</li>
</ul> 
</p>


<br>
<br>
<br>
<br>


## Installation

Due to this being a direct mock of the offical Google App, this app will not be released for commercial use. If you would still like to install, follow the below steps:
1. Click the **Code** button.
2. Once you see a menu popup, click the **Download Zip** button. This will save the project to your computer.
3. Once the download is complete, find the file and unzip the conent (you can do this by double-clicking or right-clicking and pressing Extract Files).
4. Open Android Studio and click **Open an existing Android Studio Project**. (If a project is already open, you can select **File** > **New** > **Import Project**.
5. Wait for Android Studio to open the project and press the **Run** button.
