# Music Listening Quiz Tool<br>
This program is a study tool for listening quizzes in music classes.<br><br>

## How to use the program
* Acquire the audio files you want to use in the program (they must be in .wav format)<br>

* In the input.txt file, specify the number of pieces you want to include on the top line. Then, provide the repertoire information in the following format:<br>

composer;piece name;time period;piece type;year;audiofile.wav;minxxsecxx;<br><br>
For example:<br>

Hector Berlioz;Symphonie fantastique;Romantic;Symphony;1830s;symphoniefantastiqueaudio.wav;min56sec41;<br>
Make sure the audio files and input.txt are in the same folder.<br>

## Notes<br>
* When providing the audio file name, ensure to include the ".wav" extension.<br>
* The "minxxsecxx" field is where you specify the length of the audio file. If the piece is less than 10 minutes, add a leading zero (e.g. min03sec05).<br>
* The format must be followed exactly; any deviation may cause errors.<br><br>
## Running the program <br>
* Click on the .bat file<br>
* Once the program opens, you will be prompted to provide the path to the folder containing the audio and input files.<br>
* If you encounter the error "Exception in thread "main" java.io.FileNotFoundException: C:\Users\AFE123x\Desktop\audio\Listeningquizinput.txt (The system cannot find the file specified)", it may be because you forgot a slash at the end of the path or you need to use forward slashes instead of back slashes.<br>
* After providing the path, you will be asked if you want the program to select a piece at random.<br>
* If you encounter the error "java.io.FileNotFoundException" or the program closes unexpectedly, it may be because you mistyped the audio file name in the input.txt file or did not place the audio files in the same folder as input.txt.<br><br>
### Future plans<br>
A GUI version of this program is planned, but the development of GUI skills is necessary before implementation.
