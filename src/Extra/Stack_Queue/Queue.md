1. add(element) – Fügt ein Element am Ende der Warteschlange hinzu und gibt true zurück. Falls die Warteschlange voll ist, wird eine
   IllegalStateException ausgelöst.

2. offer(element) – Fügt ein Element am Ende der Warteschlange hinzu und gibt true zurück. Falls die Warteschlange voll ist, wird false
   zurückgegeben.

3. remove() – Entfernt das Element am Anfang der Warteschlange und gibt es zurück. Falls die Warteschlange leer ist, wird eine
   NoSuchElementException ausgelöst.

4. poll() – Entfernt das Element am Anfang der Warteschlange und gibt es zurück. Falls die Warteschlange leer ist, wird null zurückgegeben.

5. element() – Gibt das Element am Anfang der Warteschlange zurück, ohne es zu entfernen. Falls die Warteschlange leer ist, wird eine
   NoSuchElementException ausgelöst.

6. peek() – Gibt das Element am Anfang der Warteschlange zurück, ohne es zu entfernen. Falls die Warteschlange leer ist, wird null
   zurückgegeben.