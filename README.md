## To be noted

Apulaiset-package is written by Jorma Laurikkala, lecturer of Tampere University.

## Startup

Run the program through _Oope2HT_-class in terminal with command line parameters of the **names of text document (jokes_bad.txt or news_bbc.txt) and wordlist (stop_words.txt) files**.

```
javac Oope2HT.java
java Oope2HT jokes_bad.txt stop_words.txt
```

Document files need to be formatted as described below. 

Jokes:
number///type///joke here

News:
number///date///news here

## Commands

- print &lt;id>
  - With the id prints a single corresponding doc to the terminal. Identifier can be omitted to print all docs in the collection.
- pprint &lt;width> &lt;id>
  - Same as print, but print width is controlled by the parameter.
- sort &lt;type||date||id>
  - Docs are originally sorted by their ids. Sorting by type works with jokes, by date with news.
- add &lt;document>
  - Doc format is explained in startup.
- remove &lt;id>
  - Removes a doc from the collection if found.
- polish &lt;characters>
  - strips common words (listed in stop_words.txt) from the collection docs. Optional characters to be stripped can be for ex. @?"
- freqs
  - lists the number of occurences of words in the collection. Polishing is recommended before this.
- find &lt;word(s)>
  - prints all found docs with the given key words. Polishing is also recommended before this.
- reset
  - resets the collection to its original state.
- echo
  - prints users input to the terminal: useful for testing. Can be switched off and on with the command.
- quit
