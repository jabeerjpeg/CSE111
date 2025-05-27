    package task41_SpotifyTester_multiclass;

    public class Playlist {
        public String name;
        public Song[] arr1 = new Song[10];
        public int count;
        public Song []arr2 = new Song[10];
        public int count2;

        public Playlist(String name) {
            this.name = name;
            System.out.println("First Playlist created");
        }

        public void info() {
            System.out.println("First Playlist has the following songs:");
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (arr1[i] != null) {
                    System.out.println("Song-" + (i + 1));
                    /*
                    also remove song korle we make it left e shift cuz dhoro 2nd song ta delete korlam
                    and null boshalam. now when we go to the 3rd element. (i==2) here
                    tokhon 2nd song holeo it will be song C but Song 2
                     */
                    arr1[i].songInfo();
                }
                found = true;

            }
            if (!found) {
                System.out.println("No songs in First Playlist");
            }
        }

        public void addSong(Song s) {
            if (count < arr1.length) {
                System.out.println(s.name + " added to First Playlist");
                arr1[count++] = s;
            }
        }

        public void addSong(Song s, int i) {
            if (i == 10) {
                System.out.println("Cannot add song to Index " + i);
            } else if (arr1[i] != null) {
                // Shift songs to the right if the index is occupied to add song the the
                // desired array.
                for (int j = arr1.length - 1; j > i; j--) {   //also ekhane 9 theke i(index) prjonto check korse
                        /* its like if we want to store a song at index 5, we will check from 9 to 6 and then push them to the
                        right*/

                    arr1[j] = arr1[j - 1];       //stores 8 to 9
                }
                arr1[i] = s;
                System.out.println(arr1[i].name + " added to " + name + ".");
                count++;
            } else {
                arr1[i] = s;
                System.out.println(arr1[i].name + " added to " + name + ".");
                count++;
            }
        }


        public void playSong(String sname) {
            boolean find = false;
            for (int i = 0; i < count; i++) {
                Song s = arr1[i];
                if (s.name.equals(sname)) {
                    find = true;
                    System.out.println("Playing " + arr1[i].name + " by " + arr1[i].artist);
                    arr2[count2++]=s;
                    break;
                }
            }
            if (!find) {
                System.out.println(sname + " not found in playlist " + this.name);
            }


        }

        public void playSong(int ok) {
            Song s = arr1[ok];
            if (s != null) {
                System.out.println("Playing " + s.name + " by " + s.artist);
                arr2[count2++]=s;
            } else {
                System.out.println("Song at Index " + ok + " not found in " + this.name + ". ");
            }
        }

        /*
        here if from the set of 9 songs, 5th song is deleted.  when i is 5,   nested
        loop checks from i(5) to count(last element).   6,7,8,9 er songs gulake 5,6,7,8
        e niye ase like left e shift kore. ar last element ta null kore, count-- kore.
         */
        public void deleteSong(String sname) {
            boolean find = false;
            for (int i = 0; i < count; i++) {
                if (arr1[i].name.equals(sname)) {
                    find = true;
                    // Shift elements left to fill the gap
                    for (int j = i; j < count - 1; j++) {
                        arr1[j] = arr1[j + 1];
                    }
                    arr1[count - 1] = null; // Clear the last duplicate entry
                    count--; // Reduce the count of songs
                    System.out.println(sname + " deleted from " + this.name);
                    break; // Stop after deleting the first occurrence
                }
            }
            if (!find) {
                System.out.println(sname + " not found in " + this.name);
            }
        }

        public int totalSong() {
            return this.count;
        }

        public void merge(Playlist p) {
            if (this.count + p.count <= arr1.length) {
                for (int j = 0; j < p.count; j++) {
                    this.arr1[this.count++] = p.arr1[j];
                }
                System.out.println("Merge Completed!");
            } else {
                System.out.println("Not enough space to merge playlists.");
            }
        }

        public void showHistory(){
            boolean found = false;
            System.out.println("History of " +this.name+ ": ");
            for(int i = 0; i < count2; i++){
                arr2[i].songInfo();
                found = true;
            }
            if (!found) {
                System.out.println("No songs were played from " + this.name + ".");
            }
        }



    }



