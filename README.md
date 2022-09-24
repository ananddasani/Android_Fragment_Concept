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
![Fragment App1](https://user-images.githubusercontent.com/74413402/192095646-b7b58b9a-8e4e-42b4-b066-5a448bdafb33.png)
![Fragment App2](https://user-images.githubusercontent.com/74413402/192095650-40d9e8f1-b5ed-4b27-a948-0b6b87be7371.png)
![Fragment App3](https://user-images.githubusercontent.com/74413402/192095653-1b05ca4e-1830-4f27-b06b-b464ece8be37.png)
![Fragment Code](https://user-images.githubusercontent.com/74413402/192095656-cc48812c-6f65-4bf4-8488-1e6cd0b77c5d.png)

