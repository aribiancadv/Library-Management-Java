# Library Manager
A student Java project to manage a university library.

===

My system contains two sets of classes featuring inheritance: those that inherit from
LibResource and those that inherit from Inbox.

For Inbox, I determined that both Notification and Message objects would share the fields
‘sender’ and ‘timestamp’, so I created them accordingly. Note that Notification, while similar
to Message, has a 140-character limit on the text content, thereby justifying a second class
distinct from Message. I considered having the Inbox hold an ArrayList of messages and
notifications to be accessed by the User class. However, I realised the Inbox doesn’t
represent an inbox full of messages, but rather the kind of object one would find in an inbox.
A real-world message inbox is then represented in the User class’s ArrayLists that hold
messages and notifications.

For LibResource, I determined that resources shared several fields in common, such as
location, availability, the User object accessing them, and a unique ID for each resource.
Device and Book objects inherit these. Then, since PrintBook and EBook objects share
fields in common (which Device does not), it made sense to create them as subclasses of
Book. At the same time, EBook objects do not have ISBN, hence why this is only a field in
PrintBook. The superclass Book holds many methods which make sense for all books to
share, such as setting the author fields.
