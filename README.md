# Android_Fragment_Concept
Using Fragments in App Instead of Intent

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

<img src="app_images/Fragment Code.png" width="1000" /><br>

<img src="app_images/Fragment App1.png" width="300" /><br>

<img src="app_images/Fragment App2.png" width="300" /><br>

<img src="app_images/Fragment App3.png" width="300" /><br>
