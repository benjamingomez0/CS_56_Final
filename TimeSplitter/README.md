## Time Splitter 

## About

Time splitter is the final project for the CS56 Spring semester and is a simple to do list that incorporates javaFX and a little java networking. It is a simple to do list app where the user fills in several tasks that are shown on the listbox element on the left and the current task is shown on the right.

After selecting a time frame from the choice box (times range from 1 - 12 hours), a list of tasks and the time frame is sent to the sever. The server then returns to the client a string which represents the amount of seconds that each task should take when the time frame is evenly divided by the number of tasks. The current task and the recommended minutes per task is then shown. The user can then press a "Skip" button that replaces the current task with the following task . When the tasks have all been skipped, the text will read, "Complete!".

## Known issues

Unfortunately, this project landed further away from my ambitions than I would have hoped. Initially, my aim was to have the program have a live timer that would progress the user through the list, however that didn't pan out and there are some artifacts of that in the code. For example, many of the time variables are in seconds in preparation to be converted into milliseconds easily. Also, the program can only be run once, as the server closes the connection after delivering the information to the client. Had I more time, I would have kept the connection open until told later to close. Also, _the ChoiceBox does not populate until after 3 clicks_ and if the submit button is chosen while there is no time selection, the program will crash. Furthermore, _the window size of the project cannot be adjusted_ without completely messing up the display. Finally , since the Server must have a container for the received object, I needed to define the class in that part of the project which is a completely different folder. Had I more time I would have figured out a way to have the class definition appear in the project only once. I have to say that file structure is one of my greatest weaknesses. 

## Future Plans

In later iterations of this project I hope to make the timer feature work, and to make the networking features more robust and non-trivial. I also hope to style the project a little more to my liking and of course eliminate some of these bugs.






