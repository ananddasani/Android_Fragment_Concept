# Android_Fragment_Concept
Using Fragments in App Instead of Intent

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

# Code

#### MainActivity.java
```
Button frag1, frag2;

frag1 = findViewById(R.id.frag1);
frag2 = findViewById(R.id.frag2);

//set on click listener
frag1.setOnClickListener(this);
frag2.setOnClickListener(this);

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.frag1:

                FragmentOne fragmentOne = new FragmentOne();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, fragmentOne);
                transaction.commit();

                break;

            case R.id.frag2:

                FragmentTwo fragmentTwo = new FragmentTwo();
                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.linearLayout, fragmentTwo);
                transaction1.commit();

                break;
        }
    }
```

# App Highlight
![Fragment and Tabs App](https://user-images.githubusercontent.com/74413402/192095523-887768de-3e7c-4916-a606-17d6a503652e.png)
![Fragment and Tabs Code](https://user-images.githubusercontent.com/74413402/192095527-af78a92f-7e72-4c23-88c1-7f7d498f2231.png)

