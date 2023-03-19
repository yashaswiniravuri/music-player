# Music Player
This is a simple command-line music player written in Java that allows users to play songs from a local directory, pause and resume playback, restart the current song, play another song, and exit the program.

## Requirements
- Java Development Kit (JDK)
- Java Sound API

## Usage
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Create a folder named "Playlist" in the project directory.
4. Copy your music files into the "Playlist" folder.
5. Compile the Main.java file using the command `javac Main.java`.
6. Run the program using the command `java Main`.

The program will display a list of the songs in the "Playlist" folder. Enter the number of the song you want to play. The program will start playing the selected song and display a menu of options:

1. Pause - pauses the current song
2. Resume - resumes playback of the current song
3. Restart the current song - starts the current song from the beginning
4. Play another song - stops the current song and prompts the user to select another song to play
5. Stop - stops the current song and exits the program
6. Invalid response - displays an error message and returns to the menu

To select an option, enter the corresponding number and press Enter.

## Future Improvements
- Add support for playlists
- Add shuffle and repeat options
- Add volume control
- Add support for more file formats
