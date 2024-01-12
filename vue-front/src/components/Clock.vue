<script setup>
import { onMounted, ref, reactive } from 'vue';

const props = defineProps({
    region: {
        type: String,
    },
    
});

let time = ref("");

onMounted(() => {
    console.log("mounted")
    //console.log($moment)
   // let callback = () => this.time = this.$moment().tz("America/Toronto").format(this.format)
    //callback();
    //this.timerId = setInterval(callback, 1000);
});



</script>
<template>
    <div class="col-12 lg:col-6 xl:col-2">
            <div class="card mb-0">
                <div class="flex justify-content-between mb-3">
                    <div>
                        <span class="block text-500 font-medium mb-3" >{{region}}</span>
                        <div class="text-900 font-medium text-xl" >{{time}}</div>
                    </div>
                    <div class="flex align-items-center justify-content-center bg-blue-100 border-round" style="width: 2.5rem; height: 2.5rem">
                        <i class="pi pi-clock text-blue-500 text-xl"></i>
                    </div>
                </div>
                <span class="text-green-500 font-medium">{{$moment}}</span>
                <span class="text-500">since last visit</span>
            </div>
        </div>  
</template>