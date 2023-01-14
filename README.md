# Music-Listening-Quiz-Tool
### What is this program?
This program is meant to be a study tool for listening quizzes found in music classes. 
### How to use program?
-Acquire the audio files you want to implement in program (They must be .wav files)
-In the input.txt, you'll write the ammount of pieces you want to implement on the top line. After that, you can fill out the repertoire in the following format:
<br><br>
composer;piece name;time period;Piece type;year;audiofile.wav;minxxsecxx;
<br><br>
ex) Hector Berlioz;Symphonie fantastique;Romantic;Symphony;1830s;symphoniefantastiqueaudio.wav;min56sec41;
  
  -Make sure the audio files and input.txt are in the same folder. 
#### Notes about filling info
-When writing the audio file, you must have the ".wav" part. <br>
-minxxsecxx is where you put in the length of the audio file. if the piece is less than 10 minutes, you must add a 0 in the first digit (for example, min03sec05). <br>
-The format must be exact. For example, you'll run into many problems if you miss a semicolon. <br>

### Running the program
To run the program, click the .bat file. <br>
-Once the program opens up, you'll be asked to provide the path to the folder containing the audio and input files.   <br>
    &emsp;*One issue you may encounter when you input the location is that the program may close or provide following error: <br>
    
      "Exception in thread "main" java.io.FileNotFoundException: C:\Users\AFE123x\Desktop\audio\Listeningquizinput.txt (The system cannot find the file specified)"
   
  This may occur for one of two reasons: You forgot a slash at the end:<br>
    C:\Users\AFE123x\Desktop\audio\Listeningquiz is incorrect. <br>
    C:\Users\AFE123x\Desktop\audio\Listeningquiz\ is correct. <br>
        &emsp;*You need to use foward slashes (/) instead of back slashes(\). <br>
      &emsp; &emsp; *Example) C:/Users/AFE123x/Desktop/audio/Listeningquiz/    <br>    
-Afterwards, you'll be asked if you want the program to pick a piece at random. You can say yes or no. <br>
   &emsp;   *If you get a java.io.FileNotFoundException like mentioned before or the program suddenly closes, this means that you either: <br>
        &emsp;&emsp; * mistyped the audio file name in input.txt. <br>
        &emsp;&emsp; * didn't put the audiofiles in the same folder as input.txt. <br>
    
    
#### Will I ever create a GUI form of this program? 
I'm planning on this, but I'll have to learn how to program GUIs first. 

