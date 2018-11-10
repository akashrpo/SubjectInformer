package com.example.akash.marksuploader;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Student implements Parcelable {
    @SerializedName("regdNo")
    public String regdNo;

    @SerializedName("password")
    public String password;

    @SerializedName("name")
    public String name;

    @SerializedName("rollNo")
    public String rollNo;

    @SerializedName("dept")
    public String dept;

    @SerializedName("Data_Communications")
    public String Data_Communications;

    @SerializedName("Software_Engineering")
    public String Software_Engineering;

    @SerializedName("Operating_Systems")
    public String Operating_Systems;

    @SerializedName("Discrete_Structures")
    public String Discrete_Structures;

    @SerializedName("Stochastic_Processes")
    public String Stochastic_Processes;

    @SerializedName("Advanced_Java")
    public String Advanced_Java;

    public Student(Parcel in) {
        String[] data = new String[11];
        in.readStringArray(data);
        this.regdNo = data[0];
        this.password = data[1];
        this.name = data[2];
        this.rollNo = data[3];
        this.dept = data[4];
        this.Data_Communications = data[5];
        this.Software_Engineering = data[6];
        this.Operating_Systems = data[7];
        this.Discrete_Structures = data[8];
        this.Stochastic_Processes = data[9];
        this.Advanced_Java = data[10];
    }

    public Student() {
        //Empty Constructor
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[]{this.regdNo, this.password, this.name,
                this.rollNo, this.dept, this.Data_Communications, this.Software_Engineering,
                this.Operating_Systems, this.Discrete_Structures, this.Stochastic_Processes, this.Advanced_Java});
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel source) {
            // TODO Auto-generated method stub
            return new Student(source);  //using parcelable constructor
        }

        @Override
        public Student[] newArray(int size) {
            // TODO Auto-generated method stub
            return new Student[size];
        }
    };


}
