loop = True
while loop:
    print("------QUESTIONS------")
    print()
    typeQ1=input(" Do you have a Fever? (Y/N)")
    typeQ2=input(" Do you have a Cough? (Y/N)")
    typeQ3=input(" Do you have difficulty in breathing? (Y/N)")
    if (typeQ1.casefold() == "yes") or (typeQ2.casefold() == "yes") or (typeQ3.casefold() == "yes"):
        print(" You may have COVID-19 symptoms. (Please consult a Healthcare")
    else:
     if (typeQ1.casefold() == "no") or (typeQ2.casefold() == "no") or (typeQ3.casefold() == "no"):
        print(" You do not have Covid-19")      
    ans=input("Do you want to try again?")
    if ans == "yes":
        continue
    else:
        break
        